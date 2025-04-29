package com.cloudframe.app.init1.dto;

/**
*  The class IypInit6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IypInit6 extends IypInit6Serialized { 
   


				private IypPriorTbl6 iypPriorTbl6 = new IypPriorTbl6();
	
	/**
	* Constructor for IypInit6
	**/
    public IypInit6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IypInit6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			iypPriorTbl6.setParent(this,getStartOffset() + 24);
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
	 *	Returns the value of iypPriorTbl6
	 *	@return iypPriorTbl6
	 */   
	 public IypPriorTbl6 getIypPriorTbl6() {
   	return iypPriorTbl6;
   }
   /**
	* 	Update IypPriorTbl6 with the passed value
	*   Corresponding COBOL Variable is WS-6IYP-PRIOR-TBL
	*	@param value
	*/
   public void setIypPriorTbl6(char[] value) {
      iypPriorTbl6.setString(value); 
   }   
    
     /**
	 * 	Update IypPriorTbl6 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl6(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl6.begin,iypPriorTbl6.length());
   }
   
     /**
	 * 	Update IypPriorTbl6 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl6.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IypPriorTbl6 with another Field
	 *	@param value
	 */
   public void setIypPriorTbl6(Field source) {
   	replace(source,0,source.length(),iypPriorTbl6.begin,iypPriorTbl6.length());
   }  
   
     /**
	 * 	Update IypPriorTbl6 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIypPriorTbl6(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl6.begin,iypPriorTbl6.length());
   }
   
     /**
	 * 	Update IypPriorTbl6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIypPriorTbl6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,iypPriorTbl6.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes IypInit6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          iypPriorTbl6.initialize();
     
   }

		public static int getIypInit6FieldLength() {
			return IYP_INIT_6_LENGTH;
		}

}
  
