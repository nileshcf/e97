package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip503011TblEffDateRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip503011TblEffDateRecord extends Ip503011TblEffDateRecordSerialized {
   

						private char[] ip503011TableId = Field.fillLowValue(8);

								private long ip503011TblEffDate;
	
	/**
	* Constructor for Ip503011TblEffDateRecord
	**/
    public Ip503011TblEffDateRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip503011TableId
	 *	@return ip503011TableId
	 */
   public char[] getIp503011TableId() throws CFException{
     if (isIp503011TableIdModified()) { 
        ip503011TableId = refreshIp503011TableId();
     }
   		return ip503011TableId;
   }

  
	/**
	*  set variable ip503011TableId
	*  Corresponding COBOL Variable is IP503011-TABLE-ID
	*  @param value
	**/
   public void setIp503011TableId(char[] value) {
      ip503011TableId = checkIp503011TableIdConstraints(value);
      serializeIp503011TableId(ip503011TableId);
   } 

     /**
	 * 	Update Ip503011TableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp503011TableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp503011TableId,ip503011TableId.length);
   	
   }
   
   public void setIp503011TableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp503011TableId,ip503011TableId.length);
   	
   }
   
     /**
	 * 	Update Ip503011TableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp503011TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp503011TableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip503011TableId with another Field
	 *	@param value
	 */
   public void setIp503011TableId(Field source) {
       replace(source,0,source.length(),beginIp503011TableId,IP_503011_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip503011TableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp503011TableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp503011TableId,IP_503011_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip503011TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp503011TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp503011TableId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip503011TblEffDate
	 *	@return ip503011TblEffDate
	 */
	public long getIp503011TblEffDate() throws CFException {
       if (isIp503011TblEffDateModified()) { 
           ip503011TblEffDate = refreshIp503011TblEffDate();
        }
   		return ip503011TblEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip503011TblEffDate with the passed value
	 *  Corresponding COBOL Variable is IP503011-TBL-EFF-DATE
	 *	@param number
	 */
	public void setIp503011TblEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip503011TblEffDate = checkIp503011TblEffDateMaxLimit(number); 
		serializeIp503011TblEffDate(ip503011TblEffDate);
	}
	

	/**
	 * 	Update Ip503011TblEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp503011TblEffDate(char[] value) throws CFException {
		 ip503011TblEffDate = serializeIp503011TblEffDate(value);
	}
	/**
	 * 	Update Ip503011TblEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp503011TblEffDateString(char[] value) throws CFException {
		 setIp503011TblEffDate(value);
	}

	
	
	

		public static int getIp503011TblEffDateRecordFieldLength() {
			return IP_503011_TBL_EFF_DATE_RECORD_LENGTH;
		}

}
  
