package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds05800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pds05800 extends Pds05800Serialized { 
   

						private char[] pds005S3ErrCde800 = Field.fillLowValue(4);
	
	/**
	* Constructor for Pds05800
	**/
    public Pds05800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pds05800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds05800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pds005S3ErrCde800
	 *	@return pds005S3ErrCde800
	 */
   public char[] getPds005S3ErrCde800() throws CFException{
     if (isPds005S3ErrCde800Modified()) { 
        pds005S3ErrCde800 = refreshPds005S3ErrCde800();
     }
   		return pds005S3ErrCde800;
   }

  
	/**
	*  set variable pds005S3ErrCde800
	*  Corresponding COBOL Variable is 800-PDS005-S3-ERR-CDE
	*  @param value
	**/
   public void setPds005S3ErrCde800(char[] value) {
      pds005S3ErrCde800 = checkPds005S3ErrCde800Constraints(value);
      serializePds005S3ErrCde800(pds005S3ErrCde800);
   } 

     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds005S3ErrCde800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPds005S3ErrCde800,pds005S3ErrCde800.length);
   	
   }
   
   public void setPds005S3ErrCde800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPds005S3ErrCde800,pds005S3ErrCde800.length);
   	
   }
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds005S3ErrCde800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds005S3ErrCde800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pds005S3ErrCde800 with another Field
	 *	@param value
	 */
   public void setPds005S3ErrCde800(Field source) {
       replace(source,0,source.length(),beginPds005S3ErrCde800,PDS_005_S_3_ERR_CDE_800_LEN);
   	
   }  
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds005S3ErrCde800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPds005S3ErrCde800,PDS_005_S_3_ERR_CDE_800_LEN);
   	
   }
   
     /**
	 * 	Update Pds005S3ErrCde800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds005S3ErrCde800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPds005S3ErrCde800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPds05800FieldLength() {
			return PDS_05800_LENGTH;
		}

}
  
