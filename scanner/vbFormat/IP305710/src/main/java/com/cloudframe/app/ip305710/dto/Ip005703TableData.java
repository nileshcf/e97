package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005703TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip005703TableData extends Ip005703TableDataSerialized {
   

								private long ip005703Tbl57PcCabGrpPtr;
				private Ip005703Tbl57Data ip005703Tbl57Data = new Ip005703Tbl57Data();
	
	/**
	* Constructor for Ip005703TableData
	**/
    public Ip005703TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip005703Tbl57Data.setParent(this,getStartOffset() + 22);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip005703Tbl57PcCabGrpPtr
	 *	@return ip005703Tbl57PcCabGrpPtr
	 */
	public long getIp005703Tbl57PcCabGrpPtr() throws CFException {
       if (isIp005703Tbl57PcCabGrpPtrModified()) { 
           ip005703Tbl57PcCabGrpPtr = refreshIp005703Tbl57PcCabGrpPtr();
        }
   		return ip005703Tbl57PcCabGrpPtr;
	}
	

	
	   
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *  Corresponding COBOL Variable is IP005703-TBL57-PC-CAB-GRP-PTR
	 *	@param number
	 */
	public void setIp005703Tbl57PcCabGrpPtr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip005703Tbl57PcCabGrpPtr = checkIp005703Tbl57PcCabGrpPtrMaxLimit(number); 
		serializeIp005703Tbl57PcCabGrpPtr(ip005703Tbl57PcCabGrpPtr);
	}
	

	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtr(char[] value) throws CFException {
		 ip005703Tbl57PcCabGrpPtr = serializeIp005703Tbl57PcCabGrpPtr(value);
	}
	/**
	 * 	Update Ip005703Tbl57PcCabGrpPtr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp005703Tbl57PcCabGrpPtrString(char[] value) throws CFException {
		 setIp005703Tbl57PcCabGrpPtr(value);
	}
	/**
	 *	Returns the value of ip005703Tbl57Data
	 *	@return ip005703Tbl57Data
	 */   
	 public Ip005703Tbl57Data getIp005703Tbl57Data() {
   	return ip005703Tbl57Data;
   }
   /**
	* 	Update Ip005703Tbl57Data with the passed value
	*   Corresponding COBOL Variable is IP005703-TBL57-DATA
	*	@param value
	*/
   public void setIp005703Tbl57Data(char[] value) {
      ip005703Tbl57Data.setString(value); 
   }   
    
     /**
	 * 	Update Ip005703Tbl57Data 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp005703Tbl57Data(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005703Tbl57Data.begin,ip005703Tbl57Data.length());
   }
   
     /**
	 * 	Update Ip005703Tbl57Data 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp005703Tbl57Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005703Tbl57Data.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip005703Tbl57Data with another Field
	 *	@param value
	 */
   public void setIp005703Tbl57Data(Field source) {
   	replace(source,0,source.length(),ip005703Tbl57Data.begin,ip005703Tbl57Data.length());
   }  
   
     /**
	 * 	Update Ip005703Tbl57Data 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp005703Tbl57Data(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip005703Tbl57Data.begin,ip005703Tbl57Data.length());
   }
   
     /**
	 * 	Update Ip005703Tbl57Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp005703Tbl57Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip005703Tbl57Data.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp005703TableDataFieldLength() {
			return IP_005703_TABLE_DATA_LENGTH;
		}

}
  
