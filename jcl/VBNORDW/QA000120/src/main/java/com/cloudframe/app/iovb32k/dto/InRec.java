package com.cloudframe.app.iovb32k.dto;

/**
*  The class InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InRec extends InRecSerialized {
   

								private int inRecDataLen;
				private InRecData inRecData = new InRecData();
	
	/**
	* Constructor for InRec
	**/
    public InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			inRecData.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setInRecDataLen(0);
    }


 

	/**
	 *	Returns the value of inRecDataLen
	 *	@return inRecDataLen
	 */
	public int getInRecDataLen() throws CFException {
        if (isInRecDataLenModified()) { 
           inRecDataLen = refreshInRecDataLen();
        }
   		return inRecDataLen;
	}
	
	/**
	 * 	Update InRecDataLen with the passed value
	 *  Corresponding COBOL Variable is WS-IN-REC-DATA-LEN
	 *	@param number
	 */
	public void setInRecDataLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    inRecDataLen = checkInRecDataLenMaxLimit(number); 
		serializeInRecDataLen(inRecDataLen);
	}


	public void setInRecDataLen(long number) {
	    number = checkInRecDataLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInRecDataLen((int)number);
	}
	
	/**
	 *	Returns the value of inRecData
	 *	@return inRecData
	 */   
	 public InRecData getInRecData() {
   	return inRecData;
   }
   /**
	* 	Update InRecData with the passed value
	*   Corresponding COBOL Variable is WS-IN-REC-DATA
	*	@param value
	*/
   public void setInRecData(char[] value) {
      inRecData.setString(value); 
   }   
    
     /**
	 * 	Update InRecData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInRecData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inRecData.begin,inRecData.length());
   }
   
     /**
	 * 	Update InRecData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInRecData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inRecData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InRecData with another Field
	 *	@param value
	 */
   public void setInRecData(Field source) {
   	replace(source,0,source.length(),inRecData.begin,inRecData.length());
   }  
   
     /**
	 * 	Update InRecData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInRecData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inRecData.begin,inRecData.length());
   }
   
     /**
	 * 	Update InRecData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInRecData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inRecData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getInRecFieldLength() {
			return IN_REC_LENGTH;
		}

}
  
