package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip570004TableEntry extends Ip570004TableEntrySerialized { 
   

								private long ip570004Tbl57PcCabGrpPtr;
				private Ip570004Tbl57PointerData ip570004Tbl57PointerData = new Ip570004Tbl57PointerData();
	
	/**
	* Constructor for Ip570004TableEntry
	**/
    public Ip570004TableEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip570004TableEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip570004Tbl57PointerData.setParent(this,getStartOffset() + 6);
    } 

	public long getIp570004Tbl57PcCabGrpPtr() throws CFException {
        if (isIp570004Tbl57PcCabGrpPtrModified()) { 
           ip570004Tbl57PcCabGrpPtr = refreshIp570004Tbl57PcCabGrpPtr();
        }
   		return ip570004Tbl57PcCabGrpPtr;
	}
	
	/**
	 * 	Update Ip570004Tbl57PcCabGrpPtr with the passed value
	 *  Corresponding COBOL Variable is IP570004-TBL57-PC-CAB-GRP-PTR
	 *	@param number
	 */
	public void setIp570004Tbl57PcCabGrpPtr(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			ip570004Tbl57PcCabGrpPtr = checkIp570004Tbl57PcCabGrpPtrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp570004Tbl57PcCabGrpPtr(ip570004Tbl57PcCabGrpPtr);
	}


	/**
	 *	Returns the value of ip570004Tbl57PointerData
	 *	@return ip570004Tbl57PointerData
	 */   
	 public Ip570004Tbl57PointerData getIp570004Tbl57PointerData() {
   	return ip570004Tbl57PointerData;
   }
   /**
	* 	Update Ip570004Tbl57PointerData with the passed value
	*   Corresponding COBOL Variable is IP570004-TBL57-POINTER-DATA
	*	@param value
	*/
   public void setIp570004Tbl57PointerData(char[] value) {
      ip570004Tbl57PointerData.setString(value); 
   }   
    
     /**
	 * 	Update Ip570004Tbl57PointerData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp570004Tbl57PointerData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip570004Tbl57PointerData.begin,ip570004Tbl57PointerData.length());
   }
   
     /**
	 * 	Update Ip570004Tbl57PointerData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004Tbl57PointerData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip570004Tbl57PointerData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip570004Tbl57PointerData with another Field
	 *	@param value
	 */
   public void setIp570004Tbl57PointerData(Field source) {
   	replace(source,0,source.length(),ip570004Tbl57PointerData.begin,ip570004Tbl57PointerData.length());
   }  
   
     /**
	 * 	Update Ip570004Tbl57PointerData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp570004Tbl57PointerData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip570004Tbl57PointerData.begin,ip570004Tbl57PointerData.length());
   }
   
     /**
	 * 	Update Ip570004Tbl57PointerData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004Tbl57PointerData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip570004Tbl57PointerData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip570004TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp570004Tbl57PcCabGrpPtr(0);
          ip570004Tbl57PointerData.initialize();
     
   }

		public static int getIp570004TableEntryFieldLength() {
			return IP_570004_TABLE_ENTRY_LENGTH;
		}

}
  
