package yoshikihigo.tinypdg.scorpio.bellon;

import java.util.TreeSet;

class CodeFragmentInfo extends TreeSet<Integer> {

	final String path;
	
	CodeFragmentInfo(final String path, final int startLine, final int endLine){
		this.path = path;
		for(int line = startLine ; line <= endLine ; line++){
			this.add(line);
		}
	}
	
	@Override
	public String toString(){
		final StringBuilder text = new StringBuilder();
		text.append(this.path);
		text.append("\t");
		for(final Integer line : this){
			text.append(line);
			text.append(",");
		}
		return text.toString();
	}
}
