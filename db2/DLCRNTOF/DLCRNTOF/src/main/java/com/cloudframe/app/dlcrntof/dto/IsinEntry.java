package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.Comparator;


public class IsinEntry extends IsinEntrySerialized { 
   
				private IsinTableData01 isinTableData01 = new IsinTableData01();
	
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
	       			isinTableData01.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of isinTableData01
	 *	@return isinTableData01
	 */   
	 public IsinTableData01 getIsinTableData01() {
   	return isinTableData01;
   }
   /**
	* 	Update IsinTableData01 with the passed value
	*   Corresponding COBOL Variable is ISIN-TABLE-DATA
	*	@param value
	*/
   public void setIsinTableData01(char[] value) {
      isinTableData01.setString(value); 
   }   
    
     /**
	 * 	Update IsinTableData01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIsinTableData01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,isinTableData01.begin,isinTableData01.length());
   }
   
     /**
	 * 	Update IsinTableData01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsinTableData01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,isinTableData01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IsinTableData01 with another Field
	 *	@param value
	 */
   public void setIsinTableData01(Field source) {
   	replace(source,0,source.length(),isinTableData01.begin,isinTableData01.length());
   }  
   
     /**
	 * 	Update IsinTableData01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIsinTableData01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,isinTableData01.begin,isinTableData01.length());
   }
   
     /**
	 * 	Update IsinTableData01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsinTableData01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,isinTableData01.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIsinEntryFieldLength() {
			return ISIN_ENTRY_LENGTH;
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
  
