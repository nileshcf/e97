package com.cloudframe.app.iovb32k.dto;

/**
*  The class OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutRec extends OutRecSerialized {
   

								private int outRecDataLen;
				private OutRecData outRecData = new OutRecData();
	
	/**
	* Constructor for OutRec
	**/
    public OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			outRecData.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setOutRecDataLen(0);
    }


 

	/**
	 *	Returns the value of outRecDataLen
	 *	@return outRecDataLen
	 */
	public int getOutRecDataLen() throws CFException {
        if (isOutRecDataLenModified()) { 
           outRecDataLen = refreshOutRecDataLen();
        }
   		return outRecDataLen;
	}
	
	/**
	 * 	Update OutRecDataLen with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-REC-DATA-LEN
	 *	@param number
	 */
	public void setOutRecDataLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outRecDataLen = checkOutRecDataLenMaxLimit(number); 
		serializeOutRecDataLen(outRecDataLen);
	}


	public void setOutRecDataLen(long number) {
	    number = checkOutRecDataLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutRecDataLen((int)number);
	}
	
	/**
	 *	Returns the value of outRecData
	 *	@return outRecData
	 */   
	 public OutRecData getOutRecData() {
   	return outRecData;
   }
   /**
	* 	Update OutRecData with the passed value
	*   Corresponding COBOL Variable is WS-OUT-REC-DATA
	*	@param value
	*/
   public void setOutRecData(char[] value) {
      outRecData.setString(value); 
   }   
    
     /**
	 * 	Update OutRecData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setOutRecData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,outRecData.begin,outRecData.length());
   }
   
     /**
	 * 	Update OutRecData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutRecData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,outRecData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update OutRecData with another Field
	 *	@param value
	 */
   public void setOutRecData(Field source) {
   	replace(source,0,source.length(),outRecData.begin,outRecData.length());
   }  
   
     /**
	 * 	Update OutRecData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setOutRecData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,outRecData.begin,outRecData.length());
   }
   
     /**
	 * 	Update OutRecData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutRecData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,outRecData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getOutRecFieldLength() {
			return OUT_REC_LENGTH;
		}

}
  
