package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/


import com.cloudframe.app.sorttbl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.Comparator;
import com.cloudframe.app.exception.CFException;


public class Ip00854wEntry extends Ip00854wEntrySerialized { 
   
				private Ip00854wTableData01 ip00854wTableData01 = new Ip00854wTableData01();
	
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
	       			ip00854wTableData01.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip00854wTableData01
	 *	@return ip00854wTableData01
	 */   
	 public Ip00854wTableData01 getIp00854wTableData01() {
   	return ip00854wTableData01;
   }
   /**
	* 	Update Ip00854wTableData01 with the passed value
	*   Corresponding COBOL Variable is IP00854W-TABLE-DATA
	*	@param value
	*/
   public void setIp00854wTableData01(char[] value) {
      ip00854wTableData01.setString(value); 
   }   
    
     /**
	 * 	Update Ip00854wTableData01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTableData01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTableData01.begin,ip00854wTableData01.length());
   }
   
     /**
	 * 	Update Ip00854wTableData01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTableData01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTableData01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00854wTableData01 with another Field
	 *	@param value
	 */
   public void setIp00854wTableData01(Field source) {
   	replace(source,0,source.length(),ip00854wTableData01.begin,ip00854wTableData01.length());
   }  
   
     /**
	 * 	Update Ip00854wTableData01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTableData01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTableData01.begin,ip00854wTableData01.length());
   }
   
     /**
	 * 	Update Ip00854wTableData01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTableData01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTableData01.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp00854wEntryFieldLength() {
			return IP_00854W_ENTRY_LENGTH;
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
  
