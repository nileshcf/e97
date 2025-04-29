package com.cloudframe.app.vsamdb2.file.records;

/**
*  The class Sys001IrdExtrFileRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.vsamdb2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001IrdExtrFileRec extends Sys001IrdExtrFileRecSerialized {
   

						private char[] sys001KeyAll = Field.fillLowValue(39);
	
	/**
	* Constructor for Sys001IrdExtrFileRec
	**/
    public Sys001IrdExtrFileRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */
   public char[] getSys001KeyAll() throws CFException{
     if (isSys001KeyAllModified()) { 
        sys001KeyAll = refreshSys001KeyAll();
     }
   		return sys001KeyAll;
   }

  
	/**
	*  set variable sys001KeyAll
	*  Corresponding COBOL Variable is SYS001-KEY-ALL
	*  @param value
	**/
   public void setSys001KeyAll(char[] value) {
      sys001KeyAll = checkSys001KeyAllConstraints(value);
      serializeSys001KeyAll(sys001KeyAll);
   } 

     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001KeyAll,sys001KeyAll.length);
   	
   }
   
   public void setSys001KeyAll(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001KeyAll,sys001KeyAll.length);
   	
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001KeyAll+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001KeyAll with another Field
	 *	@param value
	 */
   public void setSys001KeyAll(Field source) {
       replace(source,0,source.length(),beginSys001KeyAll,SYS_001_KEY_ALL_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001KeyAll,SYS_001_KEY_ALL_LEN);
   	
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001KeyAll+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001IrdExtrFileRecFieldLength() {
			return SYS_001_IRD_EXTR_FILE_REC_LENGTH;
		}

}
  
