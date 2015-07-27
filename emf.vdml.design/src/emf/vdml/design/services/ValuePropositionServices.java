package emf.vdml.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.util.Bag;

import vdml.ObValueProposition;
import vdml.SubObjValueProposition;
import vdml.SubValueProposition;
import vdml.ValueProposition;

public class ValuePropositionServices {

	public List<ValueProposition> getGenericValuePropositions(Bag<ValueProposition> props) {
		List<ValueProposition> result = new ArrayList<ValueProposition>();
		
		for (ValueProposition valueProposition : props) {
			if (!(valueProposition instanceof ObValueProposition) && !(valueProposition instanceof SubValueProposition)) {
				result.add(valueProposition);
			}
		}
		
		return result;
	}

	public List<ValueProposition> getObValuePropositions(Bag<ValueProposition> props) {
		List<ValueProposition> result = new ArrayList<ValueProposition>();
		
		for (ValueProposition valueProposition : props) {
			if (valueProposition instanceof ObValueProposition && !(valueProposition instanceof SubObjValueProposition)) {
				result.add(valueProposition);
			}
		}
		
		return result;
	}

	public List<ValueProposition> getSubValuePropositions(Bag<ValueProposition> props) {
		List<ValueProposition> result = new ArrayList<ValueProposition>();
		
		for (ValueProposition valueProposition : props) {
			if (valueProposition instanceof SubValueProposition && !(valueProposition instanceof SubObjValueProposition)) {
				result.add(valueProposition);
			}
		}
		
		return result;
	}

}
