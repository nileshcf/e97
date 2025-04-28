package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion1270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsVersion1270 extends EsVersion1270Serialized { 
   

						private char[] esHeaderId270 = new char[2];

						private char[] esVersion270 = new char[1];

						private char[] esV1HdrLength270 = new char[1];

								private int esV1SrvreqLnth270;
				private EsV1CorrelId270 esV1CorrelId270 = new EsV1CorrelId270();

						private char[] esV1SrvVersion270 = new char[1];

						private char[] esV1SiHdrLnth270 = new char[1];

						private char[] esV1SrvStatus270 = new char[1];

						private char[] esV1StatusRc270 = new char[1];

								private short esV1SrvDataLnth270;

						private char[] esV1SrvData270 = new char[8000];
	
	/**
	* Constructor for EsVersion1270
	**/
    public EsVersion1270() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EsVersion1270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion1270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			esV1CorrelId270.setParent(this,getStartOffset() + 8);
								setEsHeaderId270(("ES").toCharArray());
								setEsVersion270(fillLowValue(1));
								setEsV1HdrLength270(fillLowValue(1));
								setEsV1SrvreqLnth270(0);
								setEsV1SrvVersion270(fillLowValue(1));
								setEsV1SiHdrLnth270(fillLowValue(1));
								setEsV1SrvStatus270(fillSpace(1));
								setEsV1StatusRc270(fillLowValue(1));
								setEsV1SrvDataLnth270((short)0);
								setEsV1SrvData270(pad(8000," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of esHeaderId270
	 *	@return esHeaderId270
	 */
   public char[] getEsHeaderId270() throws CFException{
     if (isEsHeaderId270Modified()) { 
        esHeaderId270 = refreshEsHeaderId270();
     }
   		return esHeaderId270;
   }

  
	/**
	*  set variable esHeaderId270
	*  Corresponding COBOL Variable is 270-ES-HEADER-ID
	*  @param value
	**/
   public void setEsHeaderId270(char[] value) {
      esHeaderId270 = checkEsHeaderId270Constraints(value);
      serializeEsHeaderId270(esHeaderId270);
   } 

     /**
	 * 	Update EsHeaderId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsHeaderId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsHeaderId270,esHeaderId270.length);
   	
   }
   
   public void setEsHeaderId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsHeaderId270,esHeaderId270.length);
   	
   }
   
     /**
	 * 	Update EsHeaderId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsHeaderId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsHeaderId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsHeaderId270 with another Field
	 *	@param value
	 */
   public void setEsHeaderId270(Field source) {
       replace(source,0,source.length(),beginEsHeaderId270,ES_HEADER_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsHeaderId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsHeaderId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsHeaderId270,ES_HEADER_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsHeaderId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsHeaderId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsHeaderId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esVersion270
	 *	@return esVersion270
	 */
   public char[] getEsVersion270() throws CFException{
     if (isEsVersion270Modified()) { 
        esVersion270 = refreshEsVersion270();
     }
   		return esVersion270;
   }

  
	/**
	*  set variable esVersion270
	*  Corresponding COBOL Variable is 270-ES-VERSION
	*  @param value
	**/
   public void setEsVersion270(char[] value) {
      esVersion270 = checkEsVersion270Constraints(value);
      serializeEsVersion270(esVersion270);
   } 

     /**
	 * 	Update EsVersion270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsVersion270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsVersion270,esVersion270.length);
   	
   }
   
   public void setEsVersion270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsVersion270,esVersion270.length);
   	
   }
   
     /**
	 * 	Update EsVersion270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsVersion270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsVersion270 with another Field
	 *	@param value
	 */
   public void setEsVersion270(Field source) {
       replace(source,0,source.length(),beginEsVersion270,ES_VERSION_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsVersion270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsVersion270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsVersion270,ES_VERSION_270_LEN);
   	
   }
   
     /**
	 * 	Update EsVersion270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsVersion270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsVersion270+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x01} for isEsVersion188270()
	 *	@return  Returns true if isEsVersion188270() is new byte[] {(byte)0x01}
	 */
   public boolean isEsVersion188270() throws CFException {
      return (  compareChars( getEsVersion270() , convertEbcdicBytes2Char(new byte[] {(byte)0x01}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setEsVersion188270True() {  			
    	setEsVersion270( "convertEbcdicBytes2Char(new byte[] {(byte)0x01})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02} for isEsVersion288270()
	 *	@return  Returns true if isEsVersion288270() is new byte[] {(byte)0x02}
	 */
   public boolean isEsVersion288270() throws CFException {
      return (  compareChars( getEsVersion270() , convertEbcdicBytes2Char(new byte[] {(byte)0x02}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setEsVersion288270True() {  			
    	setEsVersion270( "convertEbcdicBytes2Char(new byte[] {(byte)0x02})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x03} for isEsVersion388270()
	 *	@return  Returns true if isEsVersion388270() is new byte[] {(byte)0x03}
	 */
   public boolean isEsVersion388270() throws CFException {
      return (  compareChars( getEsVersion270() , convertEbcdicBytes2Char(new byte[] {(byte)0x03}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x03}
	*/
   	public void setEsVersion388270True() {  			
    	setEsVersion270( "convertEbcdicBytes2Char(new byte[] {(byte)0x03})".toCharArray());
   	}
	/**
	 *	Returns the value of esV1HdrLength270
	 *	@return esV1HdrLength270
	 */
   public char[] getEsV1HdrLength270() throws CFException{
     if (isEsV1HdrLength270Modified()) { 
        esV1HdrLength270 = refreshEsV1HdrLength270();
     }
   		return esV1HdrLength270;
   }

  
	/**
	*  set variable esV1HdrLength270
	*  Corresponding COBOL Variable is 270-ES-V1-HDR-LENGTH
	*  @param value
	**/
   public void setEsV1HdrLength270(char[] value) {
      esV1HdrLength270 = checkEsV1HdrLength270Constraints(value);
      serializeEsV1HdrLength270(esV1HdrLength270);
   } 

     /**
	 * 	Update EsV1HdrLength270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1HdrLength270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1HdrLength270,esV1HdrLength270.length);
   	
   }
   
   public void setEsV1HdrLength270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1HdrLength270,esV1HdrLength270.length);
   	
   }
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1HdrLength270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1HdrLength270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1HdrLength270 with another Field
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source) {
       replace(source,0,source.length(),beginEsV1HdrLength270,ES_V_1_HDR_LENGTH_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1HdrLength270,ES_V_1_HDR_LENGTH_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1HdrLength270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1HdrLength270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1HdrLength270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1SrvreqLnth270
	 *	@return esV1SrvreqLnth270
	 */
	public int getEsV1SrvreqLnth270() throws CFException {
        if (isEsV1SrvreqLnth270Modified()) { 
           esV1SrvreqLnth270 = refreshEsV1SrvreqLnth270();
        }
   		return esV1SrvreqLnth270;
	}
	
	/**
	 * 	Update EsV1SrvreqLnth270 with the passed value
	 *  Corresponding COBOL Variable is 270-ES-V1-SRVREQ-LNTH
	 *	@param number
	 */
	public void setEsV1SrvreqLnth270(int number) {
	     // Truncate if the number is beyond +/- Max range
	    esV1SrvreqLnth270 = checkEsV1SrvreqLnth270MaxLimit(number); 
		serializeEsV1SrvreqLnth270(esV1SrvreqLnth270);
	}


	public void setEsV1SrvreqLnth270(long number) {
	    number = checkEsV1SrvreqLnth270MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEsV1SrvreqLnth270((int)number);
	}
	
	/**
	 *	Returns the value of esV1CorrelId270
	 *	@return esV1CorrelId270
	 */   
	 public EsV1CorrelId270 getEsV1CorrelId270() {
   	return esV1CorrelId270;
   }
   /**
	* 	Update EsV1CorrelId270 with the passed value
	*   Corresponding COBOL Variable is 270-ES-V1-CORREL-ID
	*	@param value
	*/
   public void setEsV1CorrelId270(char[] value) {
      esV1CorrelId270.setString(value); 
   }   
    
     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esV1CorrelId270.begin,esV1CorrelId270.length());
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esV1CorrelId270.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EsV1CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source) {
   	replace(source,0,source.length(),esV1CorrelId270.begin,esV1CorrelId270.length());
   }  
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,esV1CorrelId270.begin,esV1CorrelId270.length());
   }
   
     /**
	 * 	Update EsV1CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,esV1CorrelId270.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of esV1SrvVersion270
	 *	@return esV1SrvVersion270
	 */
   public char[] getEsV1SrvVersion270() throws CFException{
     if (isEsV1SrvVersion270Modified()) { 
        esV1SrvVersion270 = refreshEsV1SrvVersion270();
     }
   		return esV1SrvVersion270;
   }

  
	/**
	*  set variable esV1SrvVersion270
	*  Corresponding COBOL Variable is 270-ES-V1-SRV-VERSION
	*  @param value
	**/
   public void setEsV1SrvVersion270(char[] value) {
      esV1SrvVersion270 = checkEsV1SrvVersion270Constraints(value);
      serializeEsV1SrvVersion270(esV1SrvVersion270);
   } 

     /**
	 * 	Update EsV1SrvVersion270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvVersion270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SrvVersion270,esV1SrvVersion270.length);
   	
   }
   
   public void setEsV1SrvVersion270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvVersion270,esV1SrvVersion270.length);
   	
   }
   
     /**
	 * 	Update EsV1SrvVersion270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvVersion270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvVersion270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SrvVersion270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvVersion270(Field source) {
       replace(source,0,source.length(),beginEsV1SrvVersion270,ES_V_1_SRV_VERSION_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SrvVersion270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvVersion270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SrvVersion270,ES_V_1_SRV_VERSION_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SrvVersion270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvVersion270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvVersion270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1SiHdrLnth270
	 *	@return esV1SiHdrLnth270
	 */
   public char[] getEsV1SiHdrLnth270() throws CFException{
     if (isEsV1SiHdrLnth270Modified()) { 
        esV1SiHdrLnth270 = refreshEsV1SiHdrLnth270();
     }
   		return esV1SiHdrLnth270;
   }

  
	/**
	*  set variable esV1SiHdrLnth270
	*  Corresponding COBOL Variable is 270-ES-V1-SI-HDR-LNTH
	*  @param value
	**/
   public void setEsV1SiHdrLnth270(char[] value) {
      esV1SiHdrLnth270 = checkEsV1SiHdrLnth270Constraints(value);
      serializeEsV1SiHdrLnth270(esV1SiHdrLnth270);
   } 

     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SiHdrLnth270,esV1SiHdrLnth270.length);
   	
   }
   
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SiHdrLnth270,esV1SiHdrLnth270.length);
   	
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SiHdrLnth270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source) {
       replace(source,0,source.length(),beginEsV1SiHdrLnth270,ES_V_1_SI_HDR_LNTH_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SiHdrLnth270,ES_V_1_SI_HDR_LNTH_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SiHdrLnth270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1SrvStatus270
	 *	@return esV1SrvStatus270
	 */
   public char[] getEsV1SrvStatus270() throws CFException{
     if (isEsV1SrvStatus270Modified()) { 
        esV1SrvStatus270 = refreshEsV1SrvStatus270();
     }
   		return esV1SrvStatus270;
   }

  
	/**
	*  set variable esV1SrvStatus270
	*  Corresponding COBOL Variable is 270-ES-V1-SRV-STATUS
	*  @param value
	**/
   public void setEsV1SrvStatus270(char[] value) {
      esV1SrvStatus270 = checkEsV1SrvStatus270Constraints(value);
      serializeEsV1SrvStatus270(esV1SrvStatus270);
   } 

     /**
	 * 	Update EsV1SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvStatus270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SrvStatus270,esV1SrvStatus270.length);
   	
   }
   
   public void setEsV1SrvStatus270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvStatus270,esV1SrvStatus270.length);
   	
   }
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvStatus270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source) {
       replace(source,0,source.length(),beginEsV1SrvStatus270,ES_V_1_SRV_STATUS_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SrvStatus270,ES_V_1_SRV_STATUS_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvStatus270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1StatusRc270
	 *	@return esV1StatusRc270
	 */
   public char[] getEsV1StatusRc270() throws CFException{
     if (isEsV1StatusRc270Modified()) { 
        esV1StatusRc270 = refreshEsV1StatusRc270();
     }
   		return esV1StatusRc270;
   }

  
	/**
	*  set variable esV1StatusRc270
	*  Corresponding COBOL Variable is 270-ES-V1-STATUS-RC
	*  @param value
	**/
   public void setEsV1StatusRc270(char[] value) {
      esV1StatusRc270 = checkEsV1StatusRc270Constraints(value);
      serializeEsV1StatusRc270(esV1StatusRc270);
   } 

     /**
	 * 	Update EsV1StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1StatusRc270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1StatusRc270,esV1StatusRc270.length);
   	
   }
   
   public void setEsV1StatusRc270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1StatusRc270,esV1StatusRc270.length);
   	
   }
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1StatusRc270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source) {
       replace(source,0,source.length(),beginEsV1StatusRc270,ES_V_1_STATUS_RC_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1StatusRc270,ES_V_1_STATUS_RC_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1StatusRc270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1SrvDataLnth270
	 *	@return esV1SrvDataLnth270
	 */
	public short getEsV1SrvDataLnth270() throws CFException {
        if (isEsV1SrvDataLnth270Modified()) { 
           esV1SrvDataLnth270 = refreshEsV1SrvDataLnth270();
        }
   		return esV1SrvDataLnth270;
	}
	
	/**
	 * 	Update EsV1SrvDataLnth270 with the passed value
	 *  Corresponding COBOL Variable is 270-ES-V1-SRV-DATA-LNTH
	 *	@param number
	 */
	public void setEsV1SrvDataLnth270(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV1SrvDataLnth270 = checkEsV1SrvDataLnth270MaxLimit(number); 
		serializeEsV1SrvDataLnth270(esV1SrvDataLnth270);
	}

	public void setEsV1SrvDataLnth270(int number) {
	    number = checkEsV1SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV1SrvDataLnth270((short)number);
	}
	public void setEsV1SrvDataLnth270(long number) {
	    number = checkEsV1SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV1SrvDataLnth270((short)number);
	}
	

	/**
	 *	Returns the value of esV1SrvData270
	 *	@return esV1SrvData270
	 */
   public char[] getEsV1SrvData270() throws CFException{
     if (isEsV1SrvData270Modified()) { 
        esV1SrvData270 = refreshEsV1SrvData270();
     }
   		return esV1SrvData270;
   }

  
	/**
	*  set variable esV1SrvData270
	*  Corresponding COBOL Variable is 270-ES-V1-SRV-DATA
	*  @param value
	**/
   public void setEsV1SrvData270(char[] value) {
      esV1SrvData270 = checkEsV1SrvData270Constraints(value);
      serializeEsV1SrvData270(esV1SrvData270);
   } 

     /**
	 * 	Update EsV1SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvData270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SrvData270,esV1SrvData270.length);
   	
   }
   
   public void setEsV1SrvData270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvData270,esV1SrvData270.length);
   	
   }
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvData270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source) {
       replace(source,0,source.length(),beginEsV1SrvData270,ES_V_1_SRV_DATA_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SrvData270,ES_V_1_SRV_DATA_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvData270+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEsVersion1270FieldLength() {
			return ES_VERSION_1270_LENGTH;
		}

}
  
