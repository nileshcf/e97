package com.cloudframe.app.iovb32k.dto;

/**
*  The class LsParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsParm extends LsParmSerialized {
   

								private short lsParmLen;
				private LsParmG lsParmG = new LsParmG();
	
	/**
	* Constructor for LsParm
	**/
    public LsParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			lsParmG.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsParmLen
	 *	@return lsParmLen
	 */
	public short getLsParmLen() throws CFException {
        if (isLsParmLenModified()) { 
           lsParmLen = refreshLsParmLen();
        }
   		return lsParmLen;
	}
	
	/**
	 * 	Update LsParmLen with the passed value
	 *  Corresponding COBOL Variable is LS-PARM-LEN
	 *	@param number
	 */
	public void setLsParmLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsParmLen = checkLsParmLenMaxLimit(number); 
		serializeLsParmLen(lsParmLen);
	}

	public void setLsParmLen(int number) {
	    number = checkLsParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParmLen((short)number);
	}
	public void setLsParmLen(long number) {
	    number = checkLsParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParmLen((short)number);
	}
	

	/**
	 *	Returns the value of lsParmG
	 *	@return lsParmG
	 */   
	 public LsParmG getLsParmG() {
   	return lsParmG;
   }
   /**
	* 	Update LsParmG with the passed value
	*   Corresponding COBOL Variable is LS-PARM-G
	*	@param value
	*/
   public void setLsParmG(char[] value) {
      lsParmG.setString(value); 
   }   
    
     /**
	 * 	Update LsParmG 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLsParmG(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lsParmG.begin,lsParmG.length());
   }
   
     /**
	 * 	Update LsParmG 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParmG(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lsParmG.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LsParmG with another Field
	 *	@param value
	 */
   public void setLsParmG(Field source) {
   	replace(source,0,source.length(),lsParmG.begin,lsParmG.length());
   }  
   
     /**
	 * 	Update LsParmG 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLsParmG(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lsParmG.begin,lsParmG.length());
   }
   
     /**
	 * 	Update LsParmG 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParmG(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lsParmG.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLsParmFieldLength() {
			return LS_PARM_LENGTH;
		}

}
  
