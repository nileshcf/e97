package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.Comparator;
import com.cloudframe.app.exception.CFException;


@Data
public class Ip00854wEntry extends Ip00854wEntrySerialized { 
   
				@Getter @Setter private Ip00854wTableData01 ip00854wTableData01 = new Ip00854wTableData01();
	
	/**
	* Constructor for Ip00854wEntry
	**/
    public Ip00854wEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00854wEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00854wTableData01().setParent(this,getStartOffset() + 0);
    } 


	public static Comparator<Ip00854wEntry> getIp00854wTxnCurrCdXComparator(boolean isAsc) throws Exception {
		return isAsc ? (o1, o2) -> {
        	try {
            	return Field.compareChars(o1.getIp00854wTableData01().getIp00854wTxnCurrCdX(), o2.getIp00854wTableData01().getIp00854wTxnCurrCdX()); 
         	} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	} : (o1, o2) -> {
        	try { 
        		return Field.compareChars(o2.getIp00854wTableData01().getIp00854wTxnCurrCdX(), o1.getIp00854wTableData01().getIp00854wTxnCurrCdX());	
			} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	};		
	}
	public static Comparator<Ip00854wEntry> getIp00854wReconCurrCdXComparator(boolean isAsc) throws Exception {
		return isAsc ? (o1, o2) -> {
        	try {
            	return Field.compareChars(o1.getIp00854wTableData01().getIp00854wReconCurrCdX(), o2.getIp00854wTableData01().getIp00854wReconCurrCdX()); 
         	} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	} : (o1, o2) -> {
        	try { 
        		return Field.compareChars(o2.getIp00854wTableData01().getIp00854wReconCurrCdX(), o1.getIp00854wTableData01().getIp00854wReconCurrCdX());	
			} catch (Exception e) {
            	throw new RuntimeException("Error occurred during comparison", e);
        	}
    	};		
	}
	public long getIp00854wRuleEffDate() {
		try {
			return getIp00854wTableData01().getIp00854wRuleEffDate();
		} catch(CFException e) {
			logger.error("CFException occurred: ",e.getMessage());
		}
		return 0;
	}

}
  
