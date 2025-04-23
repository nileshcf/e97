package com.cloudframe.app.ip088030.file.records;

/**
*  The class Sys201OutputRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201OutputRecord extends Sys201OutputRecordSerialized {
   

						private char[] sys201RecordPart1 = Field.fillLowValue(255);
				private Sys201RecordPart2 sys201RecordPart2 = new Sys201RecordPart2();
				private Sys201RecordPart3 sys201RecordPart3 = new Sys201RecordPart3();
	
	/**
	* Constructor for Sys201OutputRecord
	**/
    public Sys201OutputRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sys201RecordPart2.setParent(this,getStartOffset() + 255);
	       			sys201RecordPart3.setParent(this,getStartOffset() + 750);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201RecordPart1
	 *	@return sys201RecordPart1
	 */
   public char[] getSys201RecordPart1() throws CFException{
     if (isSys201RecordPart1Modified()) { 
        sys201RecordPart1 = refreshSys201RecordPart1();
     }
   		return sys201RecordPart1;
   }

  
	/**
	*  set variable sys201RecordPart1
	*  Corresponding COBOL Variable is SYS201-RECORD-PART-1
	*  @param value
	**/
   public void setSys201RecordPart1(char[] value) {
      sys201RecordPart1 = checkSys201RecordPart1Constraints(value);
      serializeSys201RecordPart1(sys201RecordPart1);
   } 

     /**
	 * 	Update Sys201RecordPart1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201RecordPart1,sys201RecordPart1.length);
   	
   }
   
   public void setSys201RecordPart1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201RecordPart1,sys201RecordPart1.length);
   	
   }
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201RecordPart1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201RecordPart1 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source) {
       replace(source,0,source.length(),beginSys201RecordPart1,SYS_201_RECORD_PART_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201RecordPart1,SYS_201_RECORD_PART_1_LEN);
   	
   }
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201RecordPart1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys201RecordPart2
	 *	@return sys201RecordPart2
	 */   
	 public Sys201RecordPart2 getSys201RecordPart2() {
   	return sys201RecordPart2;
   }
   /**
	* 	Update Sys201RecordPart2 with the passed value
	*   Corresponding COBOL Variable is SYS201-RECORD-PART-2
	*	@param value
	*/
   public void setSys201RecordPart2(char[] value) {
      sys201RecordPart2.setString(value); 
   }   
    
     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart2.begin,sys201RecordPart2.length());
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys201RecordPart2 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source) {
   	replace(source,0,source.length(),sys201RecordPart2.begin,sys201RecordPart2.length());
   }  
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart2.begin,sys201RecordPart2.length());
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys201RecordPart3
	 *	@return sys201RecordPart3
	 */   
	 public Sys201RecordPart3 getSys201RecordPart3() {
   	return sys201RecordPart3;
   }
   /**
	* 	Update Sys201RecordPart3 with the passed value
	*   Corresponding COBOL Variable is SYS201-RECORD-PART-3
	*	@param value
	*/
   public void setSys201RecordPart3(char[] value) {
      sys201RecordPart3.setString(value); 
   }   
    
     /**
	 * 	Update Sys201RecordPart3 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart3(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart3.begin,sys201RecordPart3.length());
   }
   
     /**
	 * 	Update Sys201RecordPart3 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart3.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys201RecordPart3 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart3(Field source) {
   	replace(source,0,source.length(),sys201RecordPart3.begin,sys201RecordPart3.length());
   }  
   
     /**
	 * 	Update Sys201RecordPart3 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart3(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart3.begin,sys201RecordPart3.length());
   }
   
     /**
	 * 	Update Sys201RecordPart3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys201RecordPart3.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys201OutputRecordFieldLength() {
			return SYS_201_OUTPUT_RECORD_LENGTH;
		}

}
  
