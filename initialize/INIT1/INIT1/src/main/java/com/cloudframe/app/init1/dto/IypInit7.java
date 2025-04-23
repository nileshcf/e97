package com.cloudframe.app.init1.dto;

/**
*  The class IypInit7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IypInit7 extends IypInit7Serialized { 
   


				private IypPriorTbl7 iypPriorTbl7 = new IypPriorTbl7();
	
	/**
	* Constructor for IypInit7
	**/
    public IypInit7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypInit7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			iypPriorTbl7.setParent(this,getStartOffset() + 24);
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 20
             ,4
             );
    } 

	/**
	 *	Returns the value of iypPriorTbl7
	 *	@return iypPriorTbl7
	 */   
	 public IypPriorTbl7 getIypPriorTbl7() {
   	return iypPriorTbl7;
   }
   /**
	* 	Update IypPriorTbl7 with the passed value
	*   Corresponding COBOL Variable is WS-7IYP-PRIOR-TBL
	*	@param value
	*/
   public void setIypPriorTbl7(char[] value) {
      iypPriorTbl7.setString(value); 
   }   
    
     /**
	 * 	Update IypPriorTbl7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl7.begin,iypPriorTbl7.length());
   }
   
     /**
	 * 	Update IypPriorTbl7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypPriorTbl7 with another Field
	 *	@param value
	 */
   public void setIypPriorTbl7(Field source) {
   	replace(source,0,source.length(),iypPriorTbl7.begin,iypPriorTbl7.length());
   }  
   
     /**
	 * 	Update IypPriorTbl7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl7.begin,iypPriorTbl7.length());
   }
   
     /**
	 * 	Update IypPriorTbl7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl7.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes IypInit7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypPriorTbl7.initialize();
     
   }

		public static int getIypInit7FieldLength() {
			return IYP_INIT_7_LENGTH;
		}

}
  
