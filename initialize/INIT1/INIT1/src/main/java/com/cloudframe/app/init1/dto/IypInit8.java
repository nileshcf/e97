package com.cloudframe.app.init1.dto;

/**
*  The class IypInit8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IypInit8 extends IypInit8Serialized { 
   


				private IypPriorTbl8 iypPriorTbl8 = new IypPriorTbl8();
	
	/**
	* Constructor for IypInit8
	**/
    public IypInit8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypInit8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			iypPriorTbl8.setParent(this,getStartOffset() + 24);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 20
             ,4
             );
    } 

	/**
	 *	Returns the value of iypPriorTbl8
	 *	@return iypPriorTbl8
	 */   
	 public IypPriorTbl8 getIypPriorTbl8() {
   	return iypPriorTbl8;
   }
   /**
	* 	Update IypPriorTbl8 with the passed value
	*   Corresponding COBOL Variable is WS-8IYP-PRIOR-TBL
	*	@param value
	*/
   public void setIypPriorTbl8(char[] value) {
      iypPriorTbl8.setString(value); 
   }   
    
     /**
	 * 	Update IypPriorTbl8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl8.begin,iypPriorTbl8.length());
   }
   
     /**
	 * 	Update IypPriorTbl8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypPriorTbl8 with another Field
	 *	@param value
	 */
   public void setIypPriorTbl8(Field source) {
   	replace(source,0,source.length(),iypPriorTbl8.begin,iypPriorTbl8.length());
   }  
   
     /**
	 * 	Update IypPriorTbl8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl8.begin,iypPriorTbl8.length());
   }
   
     /**
	 * 	Update IypPriorTbl8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl8.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes IypInit8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypPriorTbl8.initialize();
     
   }

		public static int getIypInit8FieldLength() {
			return IYP_INIT_8_LENGTH;
		}

}
  
