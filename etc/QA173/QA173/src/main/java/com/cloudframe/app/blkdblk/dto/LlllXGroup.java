package com.cloudframe.app.blkdblk.dto;

/**
*  The class LlllXGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LlllXGroup extends LlllXGroupSerialized {
   

						private char[] llllX = Field.fillLowValue(4);

								private long llll;
	
	/**
	* Constructor for LlllXGroup
	**/
    public LlllXGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of llllX
	 *	@return llllX
	 */
   public char[] getLlllX() throws CFException{
     if (isLlllXModified()) { 
        llllX = refreshLlllX();
     }
   		return llllX;
   }

  
	/**
	*  set variable llllX
	*  Corresponding COBOL Variable is LLLL-X
	*  @param value
	**/
   public void setLlllX(char[] value) {
      llllX = checkLlllXConstraints(value);
      serializeLlllX(llllX);
   } 

     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLlllX,llllX.length);
   	
   }
   
   public void setLlllX(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLlllX,llllX.length);
   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLlllX+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LlllX with another Field
	 *	@param value
	 */
   public void setLlllX(Field source) {
       replace(source,0,source.length(),beginLlllX,LLLL_X_LEN);
   	
   }  
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLlllX,LLLL_X_LEN);
   	
   }
   
     /**
	 * 	Update LlllX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLlllX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLlllX+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of llll
	 *	@return llll
	 */
	public long getLlll() throws CFException {
        if (isLlllModified()) { 
           llll = refreshLlll();
        }
   		return llll;
	}
	
	/**
	 * 	Update Llll with the passed value
	 *  Corresponding COBOL Variable is LLLL
	 *	@param number
	 */
	public void setLlll(long number) {
	     // Truncate if the number is beyond +/- Max range
	    llll = checkLlllMaxLimit(number); 
		serializeLlll(llll);
	}



	
	
	

		public static int getLlllXGroupFieldLength() {
			return LLLL_XGROUP_LENGTH;
		}

}
  
