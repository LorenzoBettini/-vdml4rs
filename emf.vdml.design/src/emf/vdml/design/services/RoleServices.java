package emf.vdml.design.services;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import vdml.ObValueProposition;
import vdml.Role;
import vdml.SourceRole;
import vdml.TargetRole;

import com.google.common.base.Function;

public class RoleServices {

	public List<Role> getGenericRoles(Set<Role> roles) {
		List<Role> result = new ArrayList<Role>();

		for (Role role : roles) {
			if (!(role instanceof SourceRole) && !(role instanceof TargetRole)) {
				result.add(role);
			}
		}

		return result;
	}

	public List<SourceRole> getSourceRoles(Set<Role> roles) {
		List<SourceRole> result = new ArrayList<SourceRole>();

		for (Role role : roles) {
			if (role instanceof SourceRole) {
				result.add((SourceRole) role);
			}
		}

		return result;
	}

	public Collection<ObValueProposition> getSourceRolesObValueProposition(
			Set<Role> roles) {
		List<SourceRole> sourceRoles = getSourceRoles(roles);

		Iterable<ObValueProposition> concat = concat(transform(sourceRoles,
				new Function<SourceRole, List<ObValueProposition>>() {

					@Override
					public List<ObValueProposition> apply(SourceRole sourceRole) {
						return sourceRole.getTargetObProposition();
					}

				}));
		return newArrayList(concat);
	}
}
