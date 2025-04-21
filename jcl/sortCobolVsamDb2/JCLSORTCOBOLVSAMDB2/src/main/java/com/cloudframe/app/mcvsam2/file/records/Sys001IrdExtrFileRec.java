package com.cloudframe.app.mcvsam2.file.records;

/**
*  The class Sys001IrdExtrFileRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcvsam2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001IrdExtrFileRec extends Sys001IrdExtrFileRecSerialized {
   
				private Sys001KeyAll sys001KeyAll = new Sys001KeyAll();

						private char[] sys001Ird = Field.fillLowValue(2);
	
	/**
	* Constructor for Sys001IrdExtrFileRec
	**/
    public Sys001IrdExtrFileRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sys001KeyAll.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001KeyAll
	 *	@return sys001KeyAll
	 */   
	 public Sys001KeyAll getSys001KeyAll() {
   	return sys001KeyAll;
   }
   /**
	* 	Update Sys001KeyAll with the passed value
	*   Corresponding COBOL Variable is SYS001-KEY-ALL
	*	@param value
	*/
   public void setSys001KeyAll(char[] value) {
      sys001KeyAll.setString(value); 
   }   
    
     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001KeyAll.begin,sys001KeyAll.length());
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001KeyAll.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys001KeyAll with another Field
	 *	@param value
	 */
   public void setSys001KeyAll(Field source) {
   	replace(source,0,source.length(),sys001KeyAll.begin,sys001KeyAll.length());
   }  
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys001KeyAll.begin,sys001KeyAll.length());
   }
   
     /**
	 * 	Update Sys001KeyAll 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001KeyAll(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys001KeyAll.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sys001Ird
	 *	@return sys001Ird
	 */
   public char[] getSys001Ird() throws CFException{
     if (isSys001IrdModified()) { 
        sys001Ird = refreshSys001Ird();
     }
   		return sys001Ird;
   }

  
	/**
	*  set variable sys001Ird
	*  Corresponding COBOL Variable is SYS001-IRD
	*  @param value
	**/
   public void setSys001Ird(char[] value) {
      sys001Ird = checkSys001IrdConstraints(value);
      serializeSys001Ird(sys001Ird);
   } 

     /**
	 * 	Update Sys001Ird 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Ird(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Ird,sys001Ird.length);
   	
   }
   
   public void setSys001Ird(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Ird,sys001Ird.length);
   	
   }
   
     /**
	 * 	Update Sys001Ird 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Ird(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Ird+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Ird with another Field
	 *	@param value
	 */
   public void setSys001Ird(Field source) {
       replace(source,0,source.length(),beginSys001Ird,SYS_001_IRD_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Ird 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Ird(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Ird,SYS_001_IRD_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Ird 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Ird(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Ird+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001IrdExtrFileRecFieldLength() {
			return SYS_001_IRD_EXTR_FILE_REC_LENGTH;
		}

}
  
