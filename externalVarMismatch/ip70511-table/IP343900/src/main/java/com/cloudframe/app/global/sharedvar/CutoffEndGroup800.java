package com.cloudframe.app.global.sharedvar;

/**
*  The class CutoffEndGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_cutoffEndGroup800")

public class CutoffEndGroup800 extends CutoffEndGroup800Serialized  implements InitializingBean {
   

						private char[] cutoffEnd800 = Field.fillLowValue(26);
	
	/**
	* Constructor for CutoffEndGroup800
	**/
    public CutoffEndGroup800() {
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
	 *	Returns the value of cutoffEnd800
	 *	@return cutoffEnd800
	 */
   public char[] getCutoffEnd800() throws CFException{
     if (isCutoffEnd800Modified()) { 
        cutoffEnd800 = refreshCutoffEnd800();
     }
   		return cutoffEnd800;
   }

  
	/**
	*  set variable cutoffEnd800
	*  Corresponding COBOL Variable is 800-CUTOFF-END
	*  @param value
	**/
   public void setCutoffEnd800(char[] value) {
      cutoffEnd800 = checkCutoffEnd800Constraints(value);
      serializeCutoffEnd800(cutoffEnd800);
   } 

     /**
	 * 	Update CutoffEnd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCutoffEnd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCutoffEnd800,cutoffEnd800.length);
   	
   }
   
   public void setCutoffEnd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffEnd800,cutoffEnd800.length);
   	
   }
   
     /**
	 * 	Update CutoffEnd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCutoffEnd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffEnd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CutoffEnd800 with another Field
	 *	@param value
	 */
   public void setCutoffEnd800(Field source) {
       replace(source,0,source.length(),beginCutoffEnd800,CUTOFF_END_800_LEN);
   	
   }  
   
     /**
	 * 	Update CutoffEnd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCutoffEnd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCutoffEnd800,CUTOFF_END_800_LEN);
   	
   }
   
     /**
	 * 	Update CutoffEnd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCutoffEnd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCutoffEnd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCutoffEndGroup800FieldLength() {
			return CUTOFF_END_GROUP_800_LENGTH;
		}

}
  
