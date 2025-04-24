package com.cloudframe.app.ip606130.dto;

/**
*  The class Sys001Read300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Sys001Read300 extends Sys001Read300Serialized { 
   


								private char[] sys001Rec300 = new char[11];
							
	
	/**
	* Constructor for Sys001Read300
	**/
    public Sys001Read300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NUMBER OF INPUT RECORDS READ               :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setSys001Rec300(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of sys001Rec300
	 *	@return sys001Rec300
	 */
   public char[] getSys001Rec300() throws CFException{
     if (isSys001Rec300Modified()) { 
        sys001Rec300 = refreshSys001Rec300();
     }
   		return sys001Rec300;
   }

  
	/**
	*  set variable sys001Rec300
	*  Corresponding COBOL Variable is 300-SYS001-REC
	*  @param value
	**/
   public void setSys001Rec300(char[] value) {
      sys001Rec300 = checkSys001Rec300Constraints(value);
      serializeSys001Rec300(sys001Rec300);
   } 

     /**
	 * 	Update Sys001Rec300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Rec300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Rec300,sys001Rec300.length);
   	
   }
   
   public void setSys001Rec300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Rec300,sys001Rec300.length);
   	
   }
   
     /**
	 * 	Update Sys001Rec300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Rec300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Rec300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Rec300 with another Field
	 *	@param value
	 */
   public void setSys001Rec300(Field source) {
       replace(source,0,source.length(),beginSys001Rec300,SYS_001_REC_300_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Rec300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Rec300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Rec300,SYS_001_REC_300_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Rec300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Rec300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Rec300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001Read300FieldLength() {
			return SYS_001_READ_300_LENGTH;
		}

}
  
