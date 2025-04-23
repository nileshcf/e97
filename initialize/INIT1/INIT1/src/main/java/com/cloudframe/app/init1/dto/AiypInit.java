package com.cloudframe.app.init1.dto;

/**
*  The class AiypInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AiypInit extends AiypInitSerialized { 
   

								private int filler8;

				private AiypPriorTbl aiypPriorTbl = new AiypPriorTbl();
	
	/**
	* Constructor for AiypInit
	**/
    public AiypInit() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AiypInit. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AiypInit(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aiypPriorTbl.setParent(this,getStartOffset() + 8);
       replaceValue( // serialize and save the value
             getBinaryString((int)0,4)
             , getStartOffset() + 4
             ,4
             );
    } 

	/**
	 *	Returns the value of filler8
	 *	@return filler8
	 */
	public int getFiller8() throws CFException {
        if (isFiller8Modified()) { 
           filler8 = refreshFiller8();
        }
   		return filler8;
	}
	
	/**
	 * 	Update Filler8 with the passed value
	 *  Corresponding COBOL Variable is FILLER8
	 *	@param number
	 */
	public void setFiller8(int number) {
	     // Truncate if the number is beyond +/- Max range
	    filler8 = checkFiller8MaxLimit(number); 
		serializeFiller8(filler8);
	}


	public void setFiller8(long number) {
	    number = checkFiller8MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFiller8((int)number);
	}
	
	/**
	 *	Returns the value of aiypPriorTbl
	 *	@return aiypPriorTbl
	 */   
	 public AiypPriorTbl getAiypPriorTbl() {
   	return aiypPriorTbl;
   }
   /**
	* 	Update AiypPriorTbl with the passed value
	*   Corresponding COBOL Variable is WS-AIYP-PRIOR-TBL
	*	@param value
	*/
   public void setAiypPriorTbl(char[] value) {
      aiypPriorTbl.setString(value); 
   }   
    
     /**
	 * 	Update AiypPriorTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAiypPriorTbl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypPriorTbl.begin,aiypPriorTbl.length());
   }
   
     /**
	 * 	Update AiypPriorTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAiypPriorTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypPriorTbl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AiypPriorTbl with another Field
	 *	@param value
	 */
   public void setAiypPriorTbl(Field source) {
   	replace(source,0,source.length(),aiypPriorTbl.begin,aiypPriorTbl.length());
   }  
   
     /**
	 * 	Update AiypPriorTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAiypPriorTbl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aiypPriorTbl.begin,aiypPriorTbl.length());
   }
   
     /**
	 * 	Update AiypPriorTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAiypPriorTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aiypPriorTbl.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes AiypInit
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          aiypPriorTbl.initialize();
     
   }

		public static int getAiypInitFieldLength() {
			return AIYP_INIT_LENGTH;
		}

}
  
