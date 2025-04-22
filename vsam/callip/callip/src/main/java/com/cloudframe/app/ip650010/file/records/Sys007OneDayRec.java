package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007OneDayRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys007OneDayRec extends Sys007OneDayRecSerialized { 
   
				private Sys007TableKeyAll sys007TableKeyAll = new Sys007TableKeyAll();
	
	/**
	* Constructor for Sys007OneDayRec
	**/
    public Sys007OneDayRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys007OneDayRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007OneDayRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sys007TableKeyAll.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of sys007TableKeyAll
	 *	@return sys007TableKeyAll
	 */   
	 public Sys007TableKeyAll getSys007TableKeyAll() {
   	return sys007TableKeyAll;
   }
   /**
	* 	Update Sys007TableKeyAll with the passed value
	*   Corresponding COBOL Variable is SYS007-TABLE-KEY-ALL
	*	@param value
	*/
   public void setSys007TableKeyAll(char[] value) {
      sys007TableKeyAll.setString(value); 
   }   
    
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007TableKeyAll.begin,sys007TableKeyAll.length());
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007TableKeyAll.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys007TableKeyAll with another Field
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source) {
   	replace(source,0,source.length(),sys007TableKeyAll.begin,sys007TableKeyAll.length());
   }  
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys007TableKeyAll.begin,sys007TableKeyAll.length());
   }
   
     /**
	 * 	Update Sys007TableKeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys007TableKeyAll.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys007OneDayRecFieldLength() {
			return SYS_007_ONE_DAY_REC_LENGTH;
		}

}
  
