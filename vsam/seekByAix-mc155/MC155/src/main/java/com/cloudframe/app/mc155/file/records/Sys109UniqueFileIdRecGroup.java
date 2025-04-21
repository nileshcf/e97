package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:57. using version 5.0.0.256
**/


import com.cloudframe.app.mc155.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys109UniqueFileIdRecGroup extends Sys109UniqueFileIdRecGroupSerialized {
   
					private Sys109UniqueFileIdRec sys109UniqueFileIdRec = new Sys109UniqueFileIdRec();
					private Sys109UniqueFileIdRec1 sys109UniqueFileIdRec1 = new Sys109UniqueFileIdRec1();
	
	/**
	* Constructor for Sys109UniqueFileIdRecGroup
	**/
    public Sys109UniqueFileIdRecGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sys109UniqueFileIdRec.setParent(this,getStartOffset() + 0);
	       			sys109UniqueFileIdRec1.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys109UniqueFileIdRec
	 *	@return sys109UniqueFileIdRec
	 */   
	 public Sys109UniqueFileIdRec getSys109UniqueFileIdRec() {
   	return sys109UniqueFileIdRec;
   }
   /**
	* 	Update Sys109UniqueFileIdRec with the passed value
	*   Corresponding COBOL Variable is SYS109-UNIQUE-FILE-ID-REC
	*	@param value
	*/
   public void setSys109UniqueFileIdRec(char[] value) {
      sys109UniqueFileIdRec.setString(value); 
   }   
    
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec.begin,sys109UniqueFileIdRec.length());
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys109UniqueFileIdRec with another Field
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source) {
   	replace(source,0,source.length(),sys109UniqueFileIdRec.begin,sys109UniqueFileIdRec.length());
   }  
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec.begin,sys109UniqueFileIdRec.length());
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys109UniqueFileIdRec1
	 *	@return sys109UniqueFileIdRec1
	 */   
	 public Sys109UniqueFileIdRec1 getSys109UniqueFileIdRec1() {
   	return sys109UniqueFileIdRec1;
   }
   /**
	* 	Update Sys109UniqueFileIdRec1 with the passed value
	*   Corresponding COBOL Variable is SYS109-UNIQUE-FILE-ID-REC1
	*	@param value
	*/
   public void setSys109UniqueFileIdRec1(char[] value) {
      sys109UniqueFileIdRec1.setString(value); 
   }   
    
     /**
	 * 	Update Sys109UniqueFileIdRec1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec1.begin,sys109UniqueFileIdRec1.length());
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys109UniqueFileIdRec1 with another Field
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec1(Field source) {
   	replace(source,0,source.length(),sys109UniqueFileIdRec1.begin,sys109UniqueFileIdRec1.length());
   }  
   
     /**
	 * 	Update Sys109UniqueFileIdRec1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec1.begin,sys109UniqueFileIdRec1.length());
   }
   
     /**
	 * 	Update Sys109UniqueFileIdRec1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109UniqueFileIdRec1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys109UniqueFileIdRec1.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys109UniqueFileIdRecGroupFieldLength() {
			return SYS_109_UNIQUE_FILE_ID_REC_GROUP_LENGTH;
		}

}
  
