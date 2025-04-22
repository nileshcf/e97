package com.cloudframe.app.ar640010.dto;

/**
*  The class StsParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StsParm250 extends StsParm250Serialized {
   
				private StsInputParm250 stsInputParm250 = new StsInputParm250();
				private StsOutputParm250 stsOutputParm250 = new StsOutputParm250();
	
	/**
	* Constructor for StsParm250
	**/
    public StsParm250() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			stsInputParm250.setParent(this,getStartOffset() + 0);
	       			stsOutputParm250.setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of stsInputParm250
	 *	@return stsInputParm250
	 */   
	 public StsInputParm250 getStsInputParm250() {
   	return stsInputParm250;
   }
   /**
	* 	Update StsInputParm250 with the passed value
	*   Corresponding COBOL Variable is 250-STS-INPUT-PARM
	*	@param value
	*/
   public void setStsInputParm250(char[] value) {
      stsInputParm250.setString(value); 
   }   
    
     /**
	 * 	Update StsInputParm250 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsInputParm250(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsInputParm250.begin,stsInputParm250.length());
   }
   
     /**
	 * 	Update StsInputParm250 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsInputParm250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsInputParm250.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsInputParm250 with another Field
	 *	@param value
	 */
   public void setStsInputParm250(Field source) {
   	replace(source,0,source.length(),stsInputParm250.begin,stsInputParm250.length());
   }  
   
     /**
	 * 	Update StsInputParm250 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsInputParm250(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsInputParm250.begin,stsInputParm250.length());
   }
   
     /**
	 * 	Update StsInputParm250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsInputParm250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsInputParm250.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of stsOutputParm250
	 *	@return stsOutputParm250
	 */   
	 public StsOutputParm250 getStsOutputParm250() {
   	return stsOutputParm250;
   }
   /**
	* 	Update StsOutputParm250 with the passed value
	*   Corresponding COBOL Variable is 250-STS-OUTPUT-PARM
	*	@param value
	*/
   public void setStsOutputParm250(char[] value) {
      stsOutputParm250.setString(value); 
   }   
    
     /**
	 * 	Update StsOutputParm250 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsOutputParm250(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsOutputParm250.begin,stsOutputParm250.length());
   }
   
     /**
	 * 	Update StsOutputParm250 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsOutputParm250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsOutputParm250.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsOutputParm250 with another Field
	 *	@param value
	 */
   public void setStsOutputParm250(Field source) {
   	replace(source,0,source.length(),stsOutputParm250.begin,stsOutputParm250.length());
   }  
   
     /**
	 * 	Update StsOutputParm250 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsOutputParm250(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsOutputParm250.begin,stsOutputParm250.length());
   }
   
     /**
	 * 	Update StsOutputParm250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsOutputParm250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsOutputParm250.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes StsParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          stsInputParm250.initialize();
     
          stsOutputParm250.initialize();
     
   }

		public static int getStsParm250FieldLength() {
			return STS_PARM_250_LENGTH;
		}

}
  
