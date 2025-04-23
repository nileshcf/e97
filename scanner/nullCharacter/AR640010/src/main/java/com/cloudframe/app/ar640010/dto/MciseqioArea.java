package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciseqioArea extends MciseqioAreaSerialized {
   

						private char[] mciseqioModule = new char[8];

						private char[] mcseqioModule = new char[8];

				private MciseqioParms mciseqioParms = new MciseqioParms();
				private MciseqioCodes mciseqioCodes = new MciseqioCodes();

								private short mciseqioReturnCode;

	
	/**
	* Constructor for MciseqioArea
	**/
    public MciseqioArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mciseqioParms.setParent(this,getStartOffset() + 41);
	       			mciseqioCodes.setParent(this,getStartOffset() + 125);
	   	/*  end of offset */
								setMciseqioModule(("MCISEQIO").toCharArray());
								setMcseqioModule(("MCSEQIO ").toCharArray());
       replaceValue( // serialize and save the value
             ("* MCSEQIO-PARMS BEGINS * ").toCharArray()
             , getStartOffset() + 16
             ,25
             );
       replaceValue( // serialize and save the value
             ("0000  MCISEQIO-PARMS   ENDS  0000").toCharArray()
             , getStartOffset() + 165
             ,33
             );
    }


 

	/**
	 *	Returns the value of mciseqioModule
	 *	@return mciseqioModule
	 */
   public char[] getMciseqioModule() throws CFException{
     if (isMciseqioModuleModified()) { 
        mciseqioModule = refreshMciseqioModule();
     }
   		return mciseqioModule;
   }

  
	/**
	*  set variable mciseqioModule
	*  Corresponding COBOL Variable is MCISEQIO-MODULE
	*  @param value
	**/
   public void setMciseqioModule(char[] value) {
      mciseqioModule = checkMciseqioModuleConstraints(value);
      serializeMciseqioModule(mciseqioModule);
   } 

     /**
	 * 	Update MciseqioModule 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMciseqioModule(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMciseqioModule,mciseqioModule.length);
   	
   }
   
   public void setMciseqioModule(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioModule,mciseqioModule.length);
   	
   }
   
     /**
	 * 	Update MciseqioModule 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioModule(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioModule+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MciseqioModule with another Field
	 *	@param value
	 */
   public void setMciseqioModule(Field source) {
       replace(source,0,source.length(),beginMciseqioModule,MCISEQIO_MODULE_LEN);
   	
   }  
   
     /**
	 * 	Update MciseqioModule 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMciseqioModule(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMciseqioModule,MCISEQIO_MODULE_LEN);
   	
   }
   
     /**
	 * 	Update MciseqioModule 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioModule(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMciseqioModule+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mcseqioModule
	 *	@return mcseqioModule
	 */
   public char[] getMcseqioModule() throws CFException{
     if (isMcseqioModuleModified()) { 
        mcseqioModule = refreshMcseqioModule();
     }
   		return mcseqioModule;
   }

  
	/**
	*  set variable mcseqioModule
	*  Corresponding COBOL Variable is MCSEQIO-MODULE
	*  @param value
	**/
   public void setMcseqioModule(char[] value) {
      mcseqioModule = checkMcseqioModuleConstraints(value);
      serializeMcseqioModule(mcseqioModule);
   } 

     /**
	 * 	Update McseqioModule 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcseqioModule(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMcseqioModule,mcseqioModule.length);
   	
   }
   
   public void setMcseqioModule(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMcseqioModule,mcseqioModule.length);
   	
   }
   
     /**
	 * 	Update McseqioModule 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcseqioModule(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcseqioModule+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update McseqioModule with another Field
	 *	@param value
	 */
   public void setMcseqioModule(Field source) {
       replace(source,0,source.length(),beginMcseqioModule,MCSEQIO_MODULE_LEN);
   	
   }  
   
     /**
	 * 	Update McseqioModule 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcseqioModule(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMcseqioModule,MCSEQIO_MODULE_LEN);
   	
   }
   
     /**
	 * 	Update McseqioModule 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcseqioModule(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMcseqioModule+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mciseqioParms
	 *	@return mciseqioParms
	 */   
	 public MciseqioParms getMciseqioParms() {
   	return mciseqioParms;
   }
   /**
	* 	Update MciseqioParms with the passed value
	*   Corresponding COBOL Variable is MCISEQIO-PARMS
	*	@param value
	*/
   public void setMciseqioParms(char[] value) {
      mciseqioParms.setString(value); 
   }   
    
     /**
	 * 	Update MciseqioParms 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciseqioParms(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioParms.begin,mciseqioParms.length());
   }
   
     /**
	 * 	Update MciseqioParms 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioParms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioParms.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciseqioParms with another Field
	 *	@param value
	 */
   public void setMciseqioParms(Field source) {
   	replace(source,0,source.length(),mciseqioParms.begin,mciseqioParms.length());
   }  
   
     /**
	 * 	Update MciseqioParms 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciseqioParms(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioParms.begin,mciseqioParms.length());
   }
   
     /**
	 * 	Update MciseqioParms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioParms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioParms.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciseqioCodes
	 *	@return mciseqioCodes
	 */   
	 public MciseqioCodes getMciseqioCodes() {
   	return mciseqioCodes;
   }
   /**
	* 	Update MciseqioCodes with the passed value
	*   Corresponding COBOL Variable is MCISEQIO-CODES
	*	@param value
	*/
   public void setMciseqioCodes(char[] value) {
      mciseqioCodes.setString(value); 
   }   
    
     /**
	 * 	Update MciseqioCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciseqioCodes(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioCodes.begin,mciseqioCodes.length());
   }
   
     /**
	 * 	Update MciseqioCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioCodes.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciseqioCodes with another Field
	 *	@param value
	 */
   public void setMciseqioCodes(Field source) {
   	replace(source,0,source.length(),mciseqioCodes.begin,mciseqioCodes.length());
   }  
   
     /**
	 * 	Update MciseqioCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciseqioCodes(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioCodes.begin,mciseqioCodes.length());
   }
   
     /**
	 * 	Update MciseqioCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciseqioCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciseqioCodes.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciseqioReturnCode
	 *	@return mciseqioReturnCode
	 */
	public short getMciseqioReturnCode() throws CFException {
        if (isMciseqioReturnCodeModified()) { 
           mciseqioReturnCode = refreshMciseqioReturnCode();
        }
   		return mciseqioReturnCode;
	}
	
	/**
	 * 	Update MciseqioReturnCode with the passed value
	 *  Corresponding COBOL Variable is MCISEQIO-RETURN-CODE
	 *	@param number
	 */
	public void setMciseqioReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mciseqioReturnCode = checkMciseqioReturnCodeMaxLimit(number); 
		serializeMciseqioReturnCode(mciseqioReturnCode);
	}

	public void setMciseqioReturnCode(int number) {
	    number = checkMciseqioReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioReturnCode((short)number);
	}
	public void setMciseqioReturnCode(long number) {
	    number = checkMciseqioReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMciseqioReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isMciseqioGood()
	 *	@return  Returns true if isMciseqioGood() is 0
	 */
   public boolean isMciseqioGood() throws CFException {
      return (  getMciseqioReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setMciseqioGoodTrue() {  			
    	setMciseqioReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isMciseqioEndAllTapes()
	 *	@return  Returns true if isMciseqioEndAllTapes() is 4
	 */
   public boolean isMciseqioEndAllTapes() throws CFException {
      return (  getMciseqioReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setMciseqioEndAllTapesTrue() {  			
    	setMciseqioReturnCode( (short)4);
   	}
	
	/**
	 *	Test condition 8 for isMciseqioEof()
	 *	@return  Returns true if isMciseqioEof() is 8
	 */
   public boolean isMciseqioEof() throws CFException {
      return (  getMciseqioReturnCode()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setMciseqioEofTrue() {  			
    	setMciseqioReturnCode( (short)8);
   	}
	
	/**
	 *	Test condition 12 for isMciseqioErrorIllreq()
	 *	@return  Returns true if isMciseqioErrorIllreq() is 12
	 */
   public boolean isMciseqioErrorIllreq() throws CFException {
      return (  getMciseqioReturnCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setMciseqioErrorIllreqTrue() {  			
    	setMciseqioReturnCode( (short)12);
   	}
	
	/**
	 *	Test condition 16 for isMciseqioErrorInvreq()
	 *	@return  Returns true if isMciseqioErrorInvreq() is 16
	 */
   public boolean isMciseqioErrorInvreq() throws CFException {
      return (  getMciseqioReturnCode()  ==  16  );
   }


	/**
	*  set values 16
	*/
   	public void setMciseqioErrorInvreqTrue() {  			
    	setMciseqioReturnCode( (short)16);
   	}
	
	/**
	 *	Test condition 20 for isMciseqioErrorOpen()
	 *	@return  Returns true if isMciseqioErrorOpen() is 20
	 */
   public boolean isMciseqioErrorOpen() throws CFException {
      return (  getMciseqioReturnCode()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setMciseqioErrorOpenTrue() {  			
    	setMciseqioReturnCode( (short)20);
   	}
	
	/**
	 *	Test condition 24 for isMciseqioVolSwitch()
	 *	@return  Returns true if isMciseqioVolSwitch() is 24
	 */
   public boolean isMciseqioVolSwitch() throws CFException {
      return (  getMciseqioReturnCode()  ==  24  );
   }


	/**
	*  set values 24
	*/
   	public void setMciseqioVolSwitchTrue() {  			
    	setMciseqioReturnCode( (short)24);
   	}
	
	/**
	 *	Test condition 28 for isMciseqioErrorGetmain()
	 *	@return  Returns true if isMciseqioErrorGetmain() is 28
	 */
   public boolean isMciseqioErrorGetmain() throws CFException {
      return (  getMciseqioReturnCode()  ==  28  );
   }


	/**
	*  set values 28
	*/
   	public void setMciseqioErrorGetmainTrue() {  			
    	setMciseqioReturnCode( (short)28);
   	}
	
	/**
	 *	Test condition 32 for isMciseqioErrorDdname()
	 *	@return  Returns true if isMciseqioErrorDdname() is 32
	 */
   public boolean isMciseqioErrorDdname() throws CFException {
      return (  getMciseqioReturnCode()  ==  32  );
   }


	/**
	*  set values 32
	*/
   	public void setMciseqioErrorDdnameTrue() {  			
    	setMciseqioReturnCode( (short)32);
   	}
	
	/**
	 *	Test condition 36 for isMciseqioErrorJfcb()
	 *	@return  Returns true if isMciseqioErrorJfcb() is 36
	 */
   public boolean isMciseqioErrorJfcb() throws CFException {
      return (  getMciseqioReturnCode()  ==  36  );
   }


	/**
	*  set values 36
	*/
   	public void setMciseqioErrorJfcbTrue() {  			
    	setMciseqioReturnCode( (short)36);
   	}
	
	/**
	 *	Test condition 40 for isMciseqioErrorVsam()
	 *	@return  Returns true if isMciseqioErrorVsam() is 40
	 */
   public boolean isMciseqioErrorVsam() throws CFException {
      return (  getMciseqioReturnCode()  ==  40  );
   }


	/**
	*  set values 40
	*/
   	public void setMciseqioErrorVsamTrue() {  			
    	setMciseqioReturnCode( (short)40);
   	}
	
	/**
	 *	Test condition 44 for isMciseqioErrorTtcd()
	 *	@return  Returns true if isMciseqioErrorTtcd() is 44
	 */
   public boolean isMciseqioErrorTtcd() throws CFException {
      return (  getMciseqioReturnCode()  ==  44  );
   }


	/**
	*  set values 44
	*/
   	public void setMciseqioErrorTtcdTrue() {  			
    	setMciseqioReturnCode( (short)44);
   	}
	
	/**
	 *	Test condition 48 for isMciseqioErrorNumVols()
	 *	@return  Returns true if isMciseqioErrorNumVols() is 48
	 */
   public boolean isMciseqioErrorNumVols() throws CFException {
      return (  getMciseqioReturnCode()  ==  48  );
   }


	/**
	*  set values 48
	*/
   	public void setMciseqioErrorNumVolsTrue() {  			
    	setMciseqioReturnCode( (short)48);
   	}

	
	
	

		public static int getMciseqioAreaFieldLength() {
			return MCISEQIO_AREA_LENGTH;
		}

}
  
