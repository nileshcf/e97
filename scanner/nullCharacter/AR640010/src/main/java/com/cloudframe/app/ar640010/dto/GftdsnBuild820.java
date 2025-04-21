package com.cloudframe.app.ar640010.dto;

/**
*  The class GftdsnBuild820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GftdsnBuild820 extends GftdsnBuild820Serialized { 
   


						private char[] gftdsnSystemId820 = new char[2];


						private char[] gftdsnBulkId820 = new char[4];


						private char[] gftdsnXferMthdCd820 = new char[1];


						private char[] gftdsnEndptId820 = new char[7];


						private char[] gftdsnYear820 = new char[2];

						private char[] gftdsnMonth820 = new char[2];

						private char[] gftdsnDay820 = new char[2];


						private char[] gftdsnHour820 = new char[2];

						private char[] gftdsnMinute820 = new char[2];

						private char[] gftdsnSecond820 = new char[2];


						private char[] gftdsnRotorChar820 = new char[1];

								private int gftdsnCyclNum820;

	
	/**
	* Constructor for GftdsnBuild820
	**/
    public GftdsnBuild820() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GftdsnBuild820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnBuild820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 0
             ,1
             );
								setGftdsnSystemId820(("AR").toCharArray());
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 3
             ,1
             );
								setGftdsnBulkId820(fillSpace(4));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 8
             ,1
             );
								setGftdsnXferMthdCd820(fillSpace(1));
       replaceValue( // serialize and save the value
             (".E").toCharArray()
             , getStartOffset() + 10
             ,2
             );
								setGftdsnEndptId820(fillSpace(7));
       replaceValue( // serialize and save the value
             (".D").toCharArray()
             , getStartOffset() + 19
             ,2
             );
								setGftdsnYear820(fillSpace(2));
								setGftdsnMonth820(fillSpace(2));
								setGftdsnDay820(fillSpace(2));
       replaceValue( // serialize and save the value
             (".T").toCharArray()
             , getStartOffset() + 27
             ,2
             );
								setGftdsnHour820(fillSpace(2));
								setGftdsnMinute820(fillSpace(2));
								setGftdsnSecond820(fillSpace(2));
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setGftdsnRotorChar820(fillSpace(1));
								setGftdsnCyclNum820(0);
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 40
             ,1
             );
    } 

	/**
	 *	Returns the value of gftdsnSystemId820
	 *	@return gftdsnSystemId820
	 */
   public char[] getGftdsnSystemId820() throws CFException{
     if (isGftdsnSystemId820Modified()) { 
        gftdsnSystemId820 = refreshGftdsnSystemId820();
     }
   		return gftdsnSystemId820;
   }

  
	/**
	*  set variable gftdsnSystemId820
	*  Corresponding COBOL Variable is 820-GFTDSN-SYSTEM-ID
	*  @param value
	**/
   public void setGftdsnSystemId820(char[] value) {
      gftdsnSystemId820 = checkGftdsnSystemId820Constraints(value);
      serializeGftdsnSystemId820(gftdsnSystemId820);
   } 

     /**
	 * 	Update GftdsnSystemId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnSystemId820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnSystemId820,gftdsnSystemId820.length);
   	
   }
   
   public void setGftdsnSystemId820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSystemId820,gftdsnSystemId820.length);
   	
   }
   
     /**
	 * 	Update GftdsnSystemId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnSystemId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSystemId820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnSystemId820 with another Field
	 *	@param value
	 */
   public void setGftdsnSystemId820(Field source) {
       replace(source,0,source.length(),beginGftdsnSystemId820,GFTDSN_SYSTEM_ID_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnSystemId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnSystemId820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnSystemId820,GFTDSN_SYSTEM_ID_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnSystemId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnSystemId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSystemId820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnBulkId820
	 *	@return gftdsnBulkId820
	 */
   public char[] getGftdsnBulkId820() throws CFException{
     if (isGftdsnBulkId820Modified()) { 
        gftdsnBulkId820 = refreshGftdsnBulkId820();
     }
   		return gftdsnBulkId820;
   }

  
	/**
	*  set variable gftdsnBulkId820
	*  Corresponding COBOL Variable is 820-GFTDSN-BULK-ID
	*  @param value
	**/
   public void setGftdsnBulkId820(char[] value) {
      gftdsnBulkId820 = checkGftdsnBulkId820Constraints(value);
      serializeGftdsnBulkId820(gftdsnBulkId820);
   } 

     /**
	 * 	Update GftdsnBulkId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnBulkId820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnBulkId820,gftdsnBulkId820.length);
   	
   }
   
   public void setGftdsnBulkId820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnBulkId820,gftdsnBulkId820.length);
   	
   }
   
     /**
	 * 	Update GftdsnBulkId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBulkId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnBulkId820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnBulkId820 with another Field
	 *	@param value
	 */
   public void setGftdsnBulkId820(Field source) {
       replace(source,0,source.length(),beginGftdsnBulkId820,GFTDSN_BULK_ID_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnBulkId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnBulkId820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnBulkId820,GFTDSN_BULK_ID_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnBulkId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnBulkId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnBulkId820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnXferMthdCd820
	 *	@return gftdsnXferMthdCd820
	 */
   public char[] getGftdsnXferMthdCd820() throws CFException{
     if (isGftdsnXferMthdCd820Modified()) { 
        gftdsnXferMthdCd820 = refreshGftdsnXferMthdCd820();
     }
   		return gftdsnXferMthdCd820;
   }

  
	/**
	*  set variable gftdsnXferMthdCd820
	*  Corresponding COBOL Variable is 820-GFTDSN-XFER-MTHD-CD
	*  @param value
	**/
   public void setGftdsnXferMthdCd820(char[] value) {
      gftdsnXferMthdCd820 = checkGftdsnXferMthdCd820Constraints(value);
      serializeGftdsnXferMthdCd820(gftdsnXferMthdCd820);
   } 

     /**
	 * 	Update GftdsnXferMthdCd820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnXferMthdCd820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnXferMthdCd820,gftdsnXferMthdCd820.length);
   	
   }
   
   public void setGftdsnXferMthdCd820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnXferMthdCd820,gftdsnXferMthdCd820.length);
   	
   }
   
     /**
	 * 	Update GftdsnXferMthdCd820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnXferMthdCd820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnXferMthdCd820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnXferMthdCd820 with another Field
	 *	@param value
	 */
   public void setGftdsnXferMthdCd820(Field source) {
       replace(source,0,source.length(),beginGftdsnXferMthdCd820,GFTDSN_XFER_MTHD_CD_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnXferMthdCd820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnXferMthdCd820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnXferMthdCd820,GFTDSN_XFER_MTHD_CD_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnXferMthdCd820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnXferMthdCd820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnXferMthdCd820+targetIndex,targetLen);
    
   }
	char[] gftdsnXferEFile8882088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isGftdsnXferEFile88820()
	 *	@return  Returns true if isGftdsnXferEFile88820() is "E"
	 */
   public boolean isGftdsnXferEFile88820() throws CFException {
      return (  compareChars( getGftdsnXferMthdCd820() , gftdsnXferEFile8882088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setGftdsnXferEFile88820True() {  			
    	setGftdsnXferMthdCd820( gftdsnXferEFile8882088Value);
   	}
	/**
	 *	Returns the value of gftdsnEndptId820
	 *	@return gftdsnEndptId820
	 */
   public char[] getGftdsnEndptId820() throws CFException{
     if (isGftdsnEndptId820Modified()) { 
        gftdsnEndptId820 = refreshGftdsnEndptId820();
     }
   		return gftdsnEndptId820;
   }

  
	/**
	*  set variable gftdsnEndptId820
	*  Corresponding COBOL Variable is 820-GFTDSN-ENDPT-ID
	*  @param value
	**/
   public void setGftdsnEndptId820(char[] value) {
      gftdsnEndptId820 = checkGftdsnEndptId820Constraints(value);
      serializeGftdsnEndptId820(gftdsnEndptId820);
   } 

     /**
	 * 	Update GftdsnEndptId820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnEndptId820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnEndptId820,gftdsnEndptId820.length);
   	
   }
   
   public void setGftdsnEndptId820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnEndptId820,gftdsnEndptId820.length);
   	
   }
   
     /**
	 * 	Update GftdsnEndptId820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnEndptId820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnEndptId820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnEndptId820 with another Field
	 *	@param value
	 */
   public void setGftdsnEndptId820(Field source) {
       replace(source,0,source.length(),beginGftdsnEndptId820,GFTDSN_ENDPT_ID_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnEndptId820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnEndptId820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnEndptId820,GFTDSN_ENDPT_ID_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnEndptId820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnEndptId820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnEndptId820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnYear820
	 *	@return gftdsnYear820
	 */
   public char[] getGftdsnYear820() throws CFException{
     if (isGftdsnYear820Modified()) { 
        gftdsnYear820 = refreshGftdsnYear820();
     }
   		return gftdsnYear820;
   }

  
	/**
	*  set variable gftdsnYear820
	*  Corresponding COBOL Variable is 820-GFTDSN-YEAR
	*  @param value
	**/
   public void setGftdsnYear820(char[] value) {
      gftdsnYear820 = checkGftdsnYear820Constraints(value);
      serializeGftdsnYear820(gftdsnYear820);
   } 

     /**
	 * 	Update GftdsnYear820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnYear820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnYear820,gftdsnYear820.length);
   	
   }
   
   public void setGftdsnYear820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnYear820,gftdsnYear820.length);
   	
   }
   
     /**
	 * 	Update GftdsnYear820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnYear820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnYear820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnYear820 with another Field
	 *	@param value
	 */
   public void setGftdsnYear820(Field source) {
       replace(source,0,source.length(),beginGftdsnYear820,GFTDSN_YEAR_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnYear820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnYear820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnYear820,GFTDSN_YEAR_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnYear820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnYear820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnYear820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnMonth820
	 *	@return gftdsnMonth820
	 */
   public char[] getGftdsnMonth820() throws CFException{
     if (isGftdsnMonth820Modified()) { 
        gftdsnMonth820 = refreshGftdsnMonth820();
     }
   		return gftdsnMonth820;
   }

  
	/**
	*  set variable gftdsnMonth820
	*  Corresponding COBOL Variable is 820-GFTDSN-MONTH
	*  @param value
	**/
   public void setGftdsnMonth820(char[] value) {
      gftdsnMonth820 = checkGftdsnMonth820Constraints(value);
      serializeGftdsnMonth820(gftdsnMonth820);
   } 

     /**
	 * 	Update GftdsnMonth820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnMonth820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnMonth820,gftdsnMonth820.length);
   	
   }
   
   public void setGftdsnMonth820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMonth820,gftdsnMonth820.length);
   	
   }
   
     /**
	 * 	Update GftdsnMonth820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnMonth820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMonth820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnMonth820 with another Field
	 *	@param value
	 */
   public void setGftdsnMonth820(Field source) {
       replace(source,0,source.length(),beginGftdsnMonth820,GFTDSN_MONTH_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnMonth820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnMonth820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnMonth820,GFTDSN_MONTH_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnMonth820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnMonth820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMonth820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnDay820
	 *	@return gftdsnDay820
	 */
   public char[] getGftdsnDay820() throws CFException{
     if (isGftdsnDay820Modified()) { 
        gftdsnDay820 = refreshGftdsnDay820();
     }
   		return gftdsnDay820;
   }

  
	/**
	*  set variable gftdsnDay820
	*  Corresponding COBOL Variable is 820-GFTDSN-DAY
	*  @param value
	**/
   public void setGftdsnDay820(char[] value) {
      gftdsnDay820 = checkGftdsnDay820Constraints(value);
      serializeGftdsnDay820(gftdsnDay820);
   } 

     /**
	 * 	Update GftdsnDay820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnDay820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnDay820,gftdsnDay820.length);
   	
   }
   
   public void setGftdsnDay820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnDay820,gftdsnDay820.length);
   	
   }
   
     /**
	 * 	Update GftdsnDay820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnDay820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnDay820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnDay820 with another Field
	 *	@param value
	 */
   public void setGftdsnDay820(Field source) {
       replace(source,0,source.length(),beginGftdsnDay820,GFTDSN_DAY_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnDay820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnDay820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnDay820,GFTDSN_DAY_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnDay820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnDay820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnDay820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnHour820
	 *	@return gftdsnHour820
	 */
   public char[] getGftdsnHour820() throws CFException{
     if (isGftdsnHour820Modified()) { 
        gftdsnHour820 = refreshGftdsnHour820();
     }
   		return gftdsnHour820;
   }

  
	/**
	*  set variable gftdsnHour820
	*  Corresponding COBOL Variable is 820-GFTDSN-HOUR
	*  @param value
	**/
   public void setGftdsnHour820(char[] value) {
      gftdsnHour820 = checkGftdsnHour820Constraints(value);
      serializeGftdsnHour820(gftdsnHour820);
   } 

     /**
	 * 	Update GftdsnHour820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnHour820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnHour820,gftdsnHour820.length);
   	
   }
   
   public void setGftdsnHour820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnHour820,gftdsnHour820.length);
   	
   }
   
     /**
	 * 	Update GftdsnHour820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnHour820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnHour820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnHour820 with another Field
	 *	@param value
	 */
   public void setGftdsnHour820(Field source) {
       replace(source,0,source.length(),beginGftdsnHour820,GFTDSN_HOUR_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnHour820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnHour820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnHour820,GFTDSN_HOUR_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnHour820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnHour820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnHour820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnMinute820
	 *	@return gftdsnMinute820
	 */
   public char[] getGftdsnMinute820() throws CFException{
     if (isGftdsnMinute820Modified()) { 
        gftdsnMinute820 = refreshGftdsnMinute820();
     }
   		return gftdsnMinute820;
   }

  
	/**
	*  set variable gftdsnMinute820
	*  Corresponding COBOL Variable is 820-GFTDSN-MINUTE
	*  @param value
	**/
   public void setGftdsnMinute820(char[] value) {
      gftdsnMinute820 = checkGftdsnMinute820Constraints(value);
      serializeGftdsnMinute820(gftdsnMinute820);
   } 

     /**
	 * 	Update GftdsnMinute820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnMinute820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnMinute820,gftdsnMinute820.length);
   	
   }
   
   public void setGftdsnMinute820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMinute820,gftdsnMinute820.length);
   	
   }
   
     /**
	 * 	Update GftdsnMinute820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnMinute820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMinute820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnMinute820 with another Field
	 *	@param value
	 */
   public void setGftdsnMinute820(Field source) {
       replace(source,0,source.length(),beginGftdsnMinute820,GFTDSN_MINUTE_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnMinute820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnMinute820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnMinute820,GFTDSN_MINUTE_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnMinute820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnMinute820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnMinute820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnSecond820
	 *	@return gftdsnSecond820
	 */
   public char[] getGftdsnSecond820() throws CFException{
     if (isGftdsnSecond820Modified()) { 
        gftdsnSecond820 = refreshGftdsnSecond820();
     }
   		return gftdsnSecond820;
   }

  
	/**
	*  set variable gftdsnSecond820
	*  Corresponding COBOL Variable is 820-GFTDSN-SECOND
	*  @param value
	**/
   public void setGftdsnSecond820(char[] value) {
      gftdsnSecond820 = checkGftdsnSecond820Constraints(value);
      serializeGftdsnSecond820(gftdsnSecond820);
   } 

     /**
	 * 	Update GftdsnSecond820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnSecond820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnSecond820,gftdsnSecond820.length);
   	
   }
   
   public void setGftdsnSecond820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSecond820,gftdsnSecond820.length);
   	
   }
   
     /**
	 * 	Update GftdsnSecond820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnSecond820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSecond820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnSecond820 with another Field
	 *	@param value
	 */
   public void setGftdsnSecond820(Field source) {
       replace(source,0,source.length(),beginGftdsnSecond820,GFTDSN_SECOND_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnSecond820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnSecond820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnSecond820,GFTDSN_SECOND_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnSecond820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnSecond820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnSecond820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnRotorChar820
	 *	@return gftdsnRotorChar820
	 */
   public char[] getGftdsnRotorChar820() throws CFException{
     if (isGftdsnRotorChar820Modified()) { 
        gftdsnRotorChar820 = refreshGftdsnRotorChar820();
     }
   		return gftdsnRotorChar820;
   }

  
	/**
	*  set variable gftdsnRotorChar820
	*  Corresponding COBOL Variable is 820-GFTDSN-ROTOR-CHAR
	*  @param value
	**/
   public void setGftdsnRotorChar820(char[] value) {
      gftdsnRotorChar820 = checkGftdsnRotorChar820Constraints(value);
      serializeGftdsnRotorChar820(gftdsnRotorChar820);
   } 

     /**
	 * 	Update GftdsnRotorChar820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftdsnRotorChar820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftdsnRotorChar820,gftdsnRotorChar820.length);
   	
   }
   
   public void setGftdsnRotorChar820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnRotorChar820,gftdsnRotorChar820.length);
   	
   }
   
     /**
	 * 	Update GftdsnRotorChar820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnRotorChar820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnRotorChar820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftdsnRotorChar820 with another Field
	 *	@param value
	 */
   public void setGftdsnRotorChar820(Field source) {
       replace(source,0,source.length(),beginGftdsnRotorChar820,GFTDSN_ROTOR_CHAR_820_LEN);
   	
   }  
   
     /**
	 * 	Update GftdsnRotorChar820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftdsnRotorChar820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftdsnRotorChar820,GFTDSN_ROTOR_CHAR_820_LEN);
   	
   }
   
     /**
	 * 	Update GftdsnRotorChar820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftdsnRotorChar820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftdsnRotorChar820+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftdsnCyclNum820
	 *	@return gftdsnCyclNum820
	 */
	public int getGftdsnCyclNum820() throws CFException {
       if (isGftdsnCyclNum820Modified()) { 
           gftdsnCyclNum820 = refreshGftdsnCyclNum820();
        }
   		return gftdsnCyclNum820;
	}
	

	
	   
	/**
	 * 	Update GftdsnCyclNum820 with the passed value
	 *  Corresponding COBOL Variable is 820-GFTDSN-CYCL-NUM
	 *	@param number
	 */
	public void setGftdsnCyclNum820(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    gftdsnCyclNum820 = checkGftdsnCyclNum820MaxLimit(number); 
		serializeGftdsnCyclNum820(gftdsnCyclNum820);
	}
	

	public void setGftdsnCyclNum820(long number) {
	    number = checkGftdsnCyclNum820MaxLimit(number); // Truncate if value is beyond +/- Max range
		setGftdsnCyclNum820((int)number);
	}
	
	/**
	 * 	Update GftdsnCyclNum820 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGftdsnCyclNum820(char[] value) throws CFException {
		 gftdsnCyclNum820 = serializeGftdsnCyclNum820(value);
	}
	/**
	 * 	Update GftdsnCyclNum820 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGftdsnCyclNum820String(char[] value) throws CFException {
		 setGftdsnCyclNum820(value);
	}

	
	
	

		public static int getGftdsnBuild820FieldLength() {
			return GFTDSN_BUILD_820_LENGTH;
		}

}
  
