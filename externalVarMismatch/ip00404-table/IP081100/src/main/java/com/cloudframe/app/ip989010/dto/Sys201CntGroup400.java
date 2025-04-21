package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys201CntGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201CntGroup400 extends Sys201CntGroup400Serialized {
   

								private long sys201Cnt400;

						private char[] sys201CntX400 = Field.fillLowValue(8);
	
	/**
	* Constructor for Sys201CntGroup400
	**/
    public Sys201CntGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSys201Cnt400(0L);
    }


 

	/**
	 *	Returns the value of sys201Cnt400
	 *	@return sys201Cnt400
	 */
	public long getSys201Cnt400() throws CFException {
       if (isSys201Cnt400Modified()) { 
           sys201Cnt400 = refreshSys201Cnt400();
        }
   		return sys201Cnt400;
	}
	

	
	   
	/**
	 * 	Update Sys201Cnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS201-CNT
	 *	@param number
	 */
	public void setSys201Cnt400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys201Cnt400 = checkSys201Cnt400MaxLimit(number); 
		serializeSys201Cnt400(sys201Cnt400);
	}
	

	/**
	 * 	Update Sys201Cnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201Cnt400(char[] value) throws CFException {
		 sys201Cnt400 = serializeSys201Cnt400(value);
	}
	/**
	 * 	Update Sys201Cnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201Cnt400String(char[] value) throws CFException {
		 setSys201Cnt400(value);
	}
	/**
	 *	Returns the value of sys201CntX400
	 *	@return sys201CntX400
	 */
   public char[] getSys201CntX400() throws CFException{
     if (isSys201CntX400Modified()) { 
        sys201CntX400 = refreshSys201CntX400();
     }
   		return sys201CntX400;
   }

  
	/**
	*  set variable sys201CntX400
	*  Corresponding COBOL Variable is 400-SYS201-CNT-X
	*  @param value
	**/
   public void setSys201CntX400(char[] value) {
      sys201CntX400 = checkSys201CntX400Constraints(value);
      serializeSys201CntX400(sys201CntX400);
   } 

     /**
	 * 	Update Sys201CntX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201CntX400(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201CntX400,sys201CntX400.length);
   	
   }
   
   public void setSys201CntX400(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CntX400,sys201CntX400.length);
   	
   }
   
     /**
	 * 	Update Sys201CntX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201CntX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CntX400+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201CntX400 with another Field
	 *	@param value
	 */
   public void setSys201CntX400(Field source) {
       replace(source,0,source.length(),beginSys201CntX400,SYS_201_CNT_X_400_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201CntX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201CntX400(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201CntX400,SYS_201_CNT_X_400_LEN);
   	
   }
   
     /**
	 * 	Update Sys201CntX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201CntX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201CntX400+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201CntGroup400FieldLength() {
			return SYS_201_CNT_GROUP_400_LENGTH;
		}

}
  
