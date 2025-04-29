package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.Comparator;


@Data
public class IsinEntry extends IsinEntrySerialized { 
   
				@Getter @Setter private IsinTableData01 isinTableData01 = new IsinTableData01();
	
	/**
	* Constructor for IsinEntry
	**/
    public IsinEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for IsinEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IsinEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIsinTableData01().setParent(this,getStartOffset() + 0);
    } 


	public static Comparator<IsinEntry> getIsinDeletedComparator(boolean isAsc) throws Exception {
		return isAsc ? (o1, o2) -> {
        	try {
            	return Field.compareChars(o1.getIsinTableData01().getIsinDeleted(), o2.getIsinTableData01().getIsinDeleted()); 
         	} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	} : (o1, o2) -> {
        	try { 
        		return Field.compareChars(o2.getIsinTableData01().getIsinDeleted(), o1.getIsinTableData01().getIsinDeleted());	
			} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	};		
	}

}
  
