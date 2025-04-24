package com.cloudframe.app.gp004760.dto;

/**
*  The class ThisProgramNameGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ThisProgramNameGroup300 extends ThisProgramNameGroup300Serialized { 
   

						private char[] thisProgramName300 = new char[8];
	
	/**
	* Constructor for ThisProgramNameGroup300
	**/
    public ThisProgramNameGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setThisProgramName300(("GP004760").toCharArray());
    }


 

	/**
	 *	Returns the value of thisProgramName300
	 *	@return thisProgramName300
	 */
   public char[] getThisProgramName300() throws CFException{
     if (isThisProgramName300Modified()) { 
        thisProgramName300 = refreshThisProgramName300();
     }
   		return thisProgramName300;
   }

  
	/**
	*  set variable thisProgramName300
	*  Corresponding COBOL Variable is 300-THIS-PROGRAM-NAME
	*  @param value
	**/
   public void setThisProgramName300(char[] value) {
      thisProgramName300 = checkThisProgramName300Constraints(value);
      serializeThisProgramName300(thisProgramName300);
   } 

     /**
	 * 	Update ThisProgramName300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setThisProgramName300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginThisProgramName300,thisProgramName300.length);
   	
   }
   
   public void setThisProgramName300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginThisProgramName300,thisProgramName300.length);
   	
   }
   
     /**
	 * 	Update ThisProgramName300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setThisProgramName300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisProgramName300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ThisProgramName300 with another Field
	 *	@param value
	 */
   public void setThisProgramName300(Field source) {
       replace(source,0,source.length(),beginThisProgramName300,THIS_PROGRAM_NAME_300_LEN);
   	
   }  
   
     /**
	 * 	Update ThisProgramName300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setThisProgramName300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginThisProgramName300,THIS_PROGRAM_NAME_300_LEN);
   	
   }
   
     /**
	 * 	Update ThisProgramName300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setThisProgramName300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisProgramName300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getThisProgramNameGroup300FieldLength() {
			return THIS_PROGRAM_NAME_GROUP_300_LENGTH;
		}

}
  
