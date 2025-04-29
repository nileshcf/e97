package com.cloudframe.app.global.sharedvar;

/**
*  The class ExtValues800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_extValues800")

public class ExtValues800 extends ExtValues800Serialized  implements InitializingBean {
   

						private char[] operationCode800 = Field.fillLowValue(2);

								private int clrCyclId800;

						private char[] updateModFileInd800 = Field.fillLowValue(3);
	
	/**
	* Constructor for ExtValues800
	**/
    public ExtValues800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of operationCode800
	 *	@return operationCode800
	 */
   public char[] getOperationCode800() throws CFException{
     if (isOperationCode800Modified()) { 
        operationCode800 = refreshOperationCode800();
     }
   		return operationCode800;
   }

  
	/**
	*  set variable operationCode800
	*  Corresponding COBOL Variable is 800-OPERATION-CODE
	*  @param value
	**/
   public void setOperationCode800(char[] value) {
      operationCode800 = checkOperationCode800Constraints(value);
      serializeOperationCode800(operationCode800);
   } 

     /**
	 * 	Update OperationCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOperationCode800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOperationCode800,operationCode800.length);
   	
   }
   
   public void setOperationCode800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOperationCode800,operationCode800.length);
   	
   }
   
     /**
	 * 	Update OperationCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOperationCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOperationCode800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OperationCode800 with another Field
	 *	@param value
	 */
   public void setOperationCode800(Field source) {
       replace(source,0,source.length(),beginOperationCode800,OPERATION_CODE_800_LEN);
   	
   }  
   
     /**
	 * 	Update OperationCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOperationCode800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOperationCode800,OPERATION_CODE_800_LEN);
   	
   }
   
     /**
	 * 	Update OperationCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOperationCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOperationCode800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public int getClrCyclId800() throws CFException {
       if (isClrCyclId800Modified()) { 
           clrCyclId800 = refreshClrCyclId800();
        }
   		return clrCyclId800;
	}
	

	
	   
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *  Corresponding COBOL Variable is 800-CLR-CYCL-ID
	 *	@param number
	 */
	public void setClrCyclId800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    clrCyclId800 = checkClrCyclId800MaxLimit(number); 
		serializeClrCyclId800(clrCyclId800);
	}
	

	public void setClrCyclId800(long number) {
	    number = checkClrCyclId800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setClrCyclId800((int)number);
	}
	
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800(char[] value) throws CFException {
		 clrCyclId800 = serializeClrCyclId800(value);
	}
	/**
	 * 	Update ClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800String(char[] value) throws CFException {
		 setClrCyclId800(value);
	}
	/**
	 *	Returns the value of updateModFileInd800
	 *	@return updateModFileInd800
	 */
   public char[] getUpdateModFileInd800() throws CFException{
     if (isUpdateModFileInd800Modified()) { 
        updateModFileInd800 = refreshUpdateModFileInd800();
     }
   		return updateModFileInd800;
   }

  
	/**
	*  set variable updateModFileInd800
	*  Corresponding COBOL Variable is 800-UPDATE-MOD-FILE-IND
	*  @param value
	**/
   public void setUpdateModFileInd800(char[] value) {
      updateModFileInd800 = checkUpdateModFileInd800Constraints(value);
      serializeUpdateModFileInd800(updateModFileInd800);
   } 

     /**
	 * 	Update UpdateModFileInd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUpdateModFileInd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUpdateModFileInd800,updateModFileInd800.length);
   	
   }
   
   public void setUpdateModFileInd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateModFileInd800,updateModFileInd800.length);
   	
   }
   
     /**
	 * 	Update UpdateModFileInd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUpdateModFileInd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateModFileInd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UpdateModFileInd800 with another Field
	 *	@param value
	 */
   public void setUpdateModFileInd800(Field source) {
       replace(source,0,source.length(),beginUpdateModFileInd800,UPDATE_MOD_FILE_IND_800_LEN);
   	
   }  
   
     /**
	 * 	Update UpdateModFileInd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUpdateModFileInd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUpdateModFileInd800,UPDATE_MOD_FILE_IND_800_LEN);
   	
   }
   
     /**
	 * 	Update UpdateModFileInd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUpdateModFileInd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateModFileInd800+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ExtValues800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setOperationCode800(CONSTANTS.SPACE_2);
                     setClrCyclId800(0);
         setUpdateModFileInd800(CONSTANTS.SPACE_3);
   }

		public static int getExtValues800FieldLength() {
			return EXT_VALUES_800_LENGTH;
		}

}
  
