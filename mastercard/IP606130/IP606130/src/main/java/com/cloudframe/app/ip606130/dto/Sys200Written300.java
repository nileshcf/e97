package com.cloudframe.app.ip606130.dto;

/**
*  The class Sys200Written300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Sys200Written300 extends Sys200Written300Serialized {
   


								private char[] sys200Rec300 = new char[11];
							
	
	/**
	* Constructor for Sys200Written300
	**/
    public Sys200Written300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NUMBER 0F OUTPUT RECORDS WRITTEN           :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setSys200Rec300(CFUtil.cobolNumberFormatter("ZZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of sys200Rec300
	 *	@return sys200Rec300
	 */
   public char[] getSys200Rec300() throws CFException{
     if (isSys200Rec300Modified()) { 
        sys200Rec300 = refreshSys200Rec300();
     }
   		return sys200Rec300;
   }

  
	/**
	*  set variable sys200Rec300
	*  Corresponding COBOL Variable is 300-SYS200-REC
	*  @param value
	**/
   public void setSys200Rec300(char[] value) {
      sys200Rec300 = checkSys200Rec300Constraints(value);
      serializeSys200Rec300(sys200Rec300);
   } 

     /**
	 * 	Update Sys200Rec300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys200Rec300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys200Rec300,sys200Rec300.length);
   	
   }
   
   public void setSys200Rec300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys200Rec300,sys200Rec300.length);
   	
   }
   
     /**
	 * 	Update Sys200Rec300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys200Rec300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys200Rec300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys200Rec300 with another Field
	 *	@param value
	 */
   public void setSys200Rec300(Field source) {
       replace(source,0,source.length(),beginSys200Rec300,SYS_200_REC_300_LEN);
   	
   }  
   
     /**
	 * 	Update Sys200Rec300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys200Rec300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys200Rec300,SYS_200_REC_300_LEN);
   	
   }
   
     /**
	 * 	Update Sys200Rec300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys200Rec300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys200Rec300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys200Written300FieldLength() {
			return SYS_200_WRITTEN_300_LENGTH;
		}

}
  
