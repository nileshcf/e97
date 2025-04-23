package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptMbrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ms10frptMbrRecord extends Ms10frptMbrRecordSerialized {
   
				private Ms10frptHeaderRec ms10frptHeaderRec = new Ms10frptHeaderRec();
	
	/**
	* Constructor for Ms10frptMbrRecord
	**/
    public Ms10frptMbrRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ms10frptHeaderRec.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ms10frptHeaderRec
	 *	@return ms10frptHeaderRec
	 */   
	 public Ms10frptHeaderRec getMs10frptHeaderRec() {
   	return ms10frptHeaderRec;
   }
   /**
	* 	Update Ms10frptHeaderRec with the passed value
	*   Corresponding COBOL Variable is MS10FRPT-HEADER-REC
	*	@param value
	*/
   public void setMs10frptHeaderRec(char[] value) {
      ms10frptHeaderRec.setString(value); 
   }   
    
     /**
	 * 	Update Ms10frptHeaderRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMs10frptHeaderRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptHeaderRec.begin,ms10frptHeaderRec.length());
   }
   
     /**
	 * 	Update Ms10frptHeaderRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptHeaderRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ms10frptHeaderRec with another Field
	 *	@param value
	 */
   public void setMs10frptHeaderRec(Field source) {
   	replace(source,0,source.length(),ms10frptHeaderRec.begin,ms10frptHeaderRec.length());
   }  
   
     /**
	 * 	Update Ms10frptHeaderRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMs10frptHeaderRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptHeaderRec.begin,ms10frptHeaderRec.length());
   }
   
     /**
	 * 	Update Ms10frptHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMs10frptHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ms10frptHeaderRec.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMs10frptMbrRecordFieldLength() {
			return MS_10FRPT_MBR_RECORD_LENGTH;
		}

}
  
