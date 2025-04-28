package com.cloudframe.app.ar640010.dto;

/**
*  The class FileXferMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileXferMsg609 extends FileXferMsg609Serialized {
   


						private char[] gftFileName609 = new char[44];
	
	/**
	* Constructor for FileXferMsg609
	**/
    public FileXferMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0090-FILE NAME:   ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setGftFileName609(fillSpace(44));
    }


 

	/**
	 *	Returns the value of gftFileName609
	 *	@return gftFileName609
	 */
   public char[] getGftFileName609() throws CFException{
     if (isGftFileName609Modified()) { 
        gftFileName609 = refreshGftFileName609();
     }
   		return gftFileName609;
   }

  
	/**
	*  set variable gftFileName609
	*  Corresponding COBOL Variable is 609-GFT-FILE-NAME
	*  @param value
	**/
   public void setGftFileName609(char[] value) {
      gftFileName609 = checkGftFileName609Constraints(value);
      serializeGftFileName609(gftFileName609);
   } 

     /**
	 * 	Update GftFileName609 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftFileName609(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftFileName609,gftFileName609.length);
   	
   }
   
   public void setGftFileName609(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftFileName609,gftFileName609.length);
   	
   }
   
     /**
	 * 	Update GftFileName609 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftFileName609(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftFileName609+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftFileName609 with another Field
	 *	@param value
	 */
   public void setGftFileName609(Field source) {
       replace(source,0,source.length(),beginGftFileName609,GFT_FILE_NAME_609_LEN);
   	
   }  
   
     /**
	 * 	Update GftFileName609 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftFileName609(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftFileName609,GFT_FILE_NAME_609_LEN);
   	
   }
   
     /**
	 * 	Update GftFileName609 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftFileName609(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftFileName609+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileXferMsg609FieldLength() {
			return FILE_XFER_MSG_609_LENGTH;
		}

}
  
