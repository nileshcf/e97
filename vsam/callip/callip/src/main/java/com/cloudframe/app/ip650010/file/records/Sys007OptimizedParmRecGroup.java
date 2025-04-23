package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007OptimizedParmRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys007OptimizedParmRecGroup extends Sys007OptimizedParmRecGroupSerialized {
   
					private Sys007OptimizedParmRec sys007OptimizedParmRec = new Sys007OptimizedParmRec();
					private Sys007OneDayRec sys007OneDayRec = new Sys007OneDayRec();
	
	/**
	* Constructor for Sys007OptimizedParmRecGroup
	**/
    public Sys007OptimizedParmRecGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sys007OptimizedParmRec.setParent(this,getStartOffset() + 0);
	       			sys007OneDayRec.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys007OptimizedParmRec
	 *	@return sys007OptimizedParmRec
	 */   
	 public Sys007OptimizedParmRec getSys007OptimizedParmRec() {
   	return sys007OptimizedParmRec;
   }
   /**
	* 	Update Sys007OptimizedParmRec with the passed value
	*   Corresponding COBOL Variable is SYS007-OPTIMIZED-PARM-REC
	*	@param value
	*/
   public void setSys007OptimizedParmRec(char[] value) {
      sys007OptimizedParmRec.setString(value); 
   }   
    
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007OptimizedParmRec.begin,sys007OptimizedParmRec.length());
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007OptimizedParmRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys007OptimizedParmRec with another Field
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source) {
   	replace(source,0,source.length(),sys007OptimizedParmRec.begin,sys007OptimizedParmRec.length());
   }  
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007OptimizedParmRec.begin,sys007OptimizedParmRec.length());
   }
   
     /**
	 * 	Update Sys007OptimizedParmRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OptimizedParmRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007OptimizedParmRec.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys007OneDayRec
	 *	@return sys007OneDayRec
	 */   
	 public Sys007OneDayRec getSys007OneDayRec() {
   	return sys007OneDayRec;
   }
   /**
	* 	Update Sys007OneDayRec with the passed value
	*   Corresponding COBOL Variable is SYS007-ONE-DAY-REC
	*	@param value
	*/
   public void setSys007OneDayRec(char[] value) {
      sys007OneDayRec.setString(value); 
   }   
    
     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007OneDayRec.begin,sys007OneDayRec.length());
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007OneDayRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys007OneDayRec with another Field
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source) {
   	replace(source,0,source.length(),sys007OneDayRec.begin,sys007OneDayRec.length());
   }  
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007OneDayRec.begin,sys007OneDayRec.length());
   }
   
     /**
	 * 	Update Sys007OneDayRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007OneDayRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007OneDayRec.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys007OptimizedParmRecGroupFieldLength() {
			return SYS_007_OPTIMIZED_PARM_REC_GROUP_LENGTH;
		}

}
  
