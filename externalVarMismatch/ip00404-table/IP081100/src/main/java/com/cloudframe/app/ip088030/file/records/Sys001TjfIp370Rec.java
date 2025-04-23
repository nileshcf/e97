package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys001TjfIp370Rec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001TjfIp370Rec extends Sys001TjfIp370RecSerialized {
   
				private Ip98151RecordPart1 ip98151RecordPart1 = new Ip98151RecordPart1();
				private Ip98152RecordPart2 ip98152RecordPart2 = new Ip98152RecordPart2();
	
	/**
	* Constructor for Sys001TjfIp370Rec
	**/
    public Sys001TjfIp370Rec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip98151RecordPart1.setParent(this,getStartOffset() + 0);
	       			ip98152RecordPart2.setParent(this,getStartOffset() + 255);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip98151RecordPart1
	 *	@return ip98151RecordPart1
	 */   
	 public Ip98151RecordPart1 getIp98151RecordPart1() {
   	return ip98151RecordPart1;
   }
   /**
	* 	Update Ip98151RecordPart1 with the passed value
	*   Corresponding COBOL Variable is IP98151-RECORD-PART-1
	*	@param value
	*/
   public void setIp98151RecordPart1(char[] value) {
      ip98151RecordPart1.setString(value); 
   }   
    
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98151RecordPart1.begin,ip98151RecordPart1.length());
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98151RecordPart1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip98151RecordPart1 with another Field
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source) {
   	replace(source,0,source.length(),ip98151RecordPart1.begin,ip98151RecordPart1.length());
   }  
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98151RecordPart1.begin,ip98151RecordPart1.length());
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98151RecordPart1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip98152RecordPart2
	 *	@return ip98152RecordPart2
	 */   
	 public Ip98152RecordPart2 getIp98152RecordPart2() {
   	return ip98152RecordPart2;
   }
   /**
	* 	Update Ip98152RecordPart2 with the passed value
	*   Corresponding COBOL Variable is IP98152-RECORD-PART-2
	*	@param value
	*/
   public void setIp98152RecordPart2(char[] value) {
      ip98152RecordPart2.setString(value); 
   }   
    
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98152RecordPart2.begin,ip98152RecordPart2.length());
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98152RecordPart2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip98152RecordPart2 with another Field
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source) {
   	replace(source,0,source.length(),ip98152RecordPart2.begin,ip98152RecordPart2.length());
   }  
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip98152RecordPart2.begin,ip98152RecordPart2.length());
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip98152RecordPart2.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys001TjfIp370RecFieldLength() {
			return SYS_001_TJF_IP_370_REC_LENGTH;
		}

}
  
