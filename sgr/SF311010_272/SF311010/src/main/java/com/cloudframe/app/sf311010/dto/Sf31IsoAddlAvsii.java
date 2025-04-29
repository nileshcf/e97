package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoAddlAvsii is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoAddlAvsii extends Sf31IsoAddlAvsiiSerialized { 
   

						private char[] sf31IsoAvs2Ship2Name = new char[27];

						private char[] sf31IsoAvs2Ship2CoName = new char[27];

						private char[] sf31IsoAvs2Ship2Add1 = new char[32];

						private char[] sf31IsoAvs2Ship2Add2 = new char[32];

						private char[] sf31IsoAvs2Ship2City = new char[15];

						private char[] sf31IsoAvs2Ship2State = new char[2];

						private char[] sf31IsoAvs2Ship2Postal = new char[9];

						private char[] sf31IsoAvs2Ship2Country = new char[3];

						private char[] sf31IsoAvs2CurrencyCode = new char[3];

						private char[] sf31IsoAvs2RespCode = new char[2];

						private char[] sf31IsoAvs2PhoneNum = new char[10];

						private char[] sf31IsoAvs2FraudAlert = new char[1];

						private char[] sf31IsoAvs2RushOrder = new char[1];

	
	/**
	* Constructor for Sf31IsoAddlAvsii
	**/
    public Sf31IsoAddlAvsii() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoAddlAvsii. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoAddlAvsii(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoAvs2Ship2Name(fillSpace(27));
								setSf31IsoAvs2Ship2CoName(fillSpace(27));
								setSf31IsoAvs2Ship2Add1(fillSpace(32));
								setSf31IsoAvs2Ship2Add2(fillSpace(32));
								setSf31IsoAvs2Ship2City(fillSpace(15));
								setSf31IsoAvs2Ship2State(fillSpace(2));
								setSf31IsoAvs2Ship2Postal(fillSpace(9));
								setSf31IsoAvs2Ship2Country(fillSpace(3));
								setSf31IsoAvs2CurrencyCode(fillSpace(3));
								setSf31IsoAvs2RespCode(fillSpace(2));
								setSf31IsoAvs2PhoneNum(fillSpace(10));
								setSf31IsoAvs2FraudAlert(fillSpace(1));
								setSf31IsoAvs2RushOrder(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 164
             ,11
             );
    } 

	/**
	 *	Returns the value of sf31IsoAvs2Ship2Name
	 *	@return sf31IsoAvs2Ship2Name
	 */
   public char[] getSf31IsoAvs2Ship2Name() throws CFException{
     if (isSf31IsoAvs2Ship2NameModified()) { 
        sf31IsoAvs2Ship2Name = refreshSf31IsoAvs2Ship2Name();
     }
   		return sf31IsoAvs2Ship2Name;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2Name
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-NAME
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2Name(char[] value) {
      sf31IsoAvs2Ship2Name = checkSf31IsoAvs2Ship2NameConstraints(value);
      serializeSf31IsoAvs2Ship2Name(sf31IsoAvs2Ship2Name);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2Name 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Name(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2Name,sf31IsoAvs2Ship2Name.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2Name(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Name,sf31IsoAvs2Ship2Name.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Name 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Name(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Name+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2Name with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Name(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2Name,SF_31_ISO_AVS_2_SHIP_2_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Name 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Name(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Name,SF_31_ISO_AVS_2_SHIP_2_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Name 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Name(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Name+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2CoName
	 *	@return sf31IsoAvs2Ship2CoName
	 */
   public char[] getSf31IsoAvs2Ship2CoName() throws CFException{
     if (isSf31IsoAvs2Ship2CoNameModified()) { 
        sf31IsoAvs2Ship2CoName = refreshSf31IsoAvs2Ship2CoName();
     }
   		return sf31IsoAvs2Ship2CoName;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2CoName
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-CO-NAME
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2CoName(char[] value) {
      sf31IsoAvs2Ship2CoName = checkSf31IsoAvs2Ship2CoNameConstraints(value);
      serializeSf31IsoAvs2Ship2CoName(sf31IsoAvs2Ship2CoName);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2CoName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2CoName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2CoName,sf31IsoAvs2Ship2CoName.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2CoName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2CoName,sf31IsoAvs2Ship2CoName.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2CoName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2CoName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2CoName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2CoName with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2CoName(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2CoName,SF_31_ISO_AVS_2_SHIP_2_CO_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2CoName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2CoName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2CoName,SF_31_ISO_AVS_2_SHIP_2_CO_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2CoName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2CoName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2CoName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2Add1
	 *	@return sf31IsoAvs2Ship2Add1
	 */
   public char[] getSf31IsoAvs2Ship2Add1() throws CFException{
     if (isSf31IsoAvs2Ship2Add1Modified()) { 
        sf31IsoAvs2Ship2Add1 = refreshSf31IsoAvs2Ship2Add1();
     }
   		return sf31IsoAvs2Ship2Add1;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2Add1
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-ADD-1
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2Add1(char[] value) {
      sf31IsoAvs2Ship2Add1 = checkSf31IsoAvs2Ship2Add1Constraints(value);
      serializeSf31IsoAvs2Ship2Add1(sf31IsoAvs2Ship2Add1);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2Add1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2Add1,sf31IsoAvs2Ship2Add1.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2Add1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add1,sf31IsoAvs2Ship2Add1.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2Add1 with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add1(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2Add1,SF_31_ISO_AVS_2_SHIP_2_ADD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add1,SF_31_ISO_AVS_2_SHIP_2_ADD_1_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2Add2
	 *	@return sf31IsoAvs2Ship2Add2
	 */
   public char[] getSf31IsoAvs2Ship2Add2() throws CFException{
     if (isSf31IsoAvs2Ship2Add2Modified()) { 
        sf31IsoAvs2Ship2Add2 = refreshSf31IsoAvs2Ship2Add2();
     }
   		return sf31IsoAvs2Ship2Add2;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2Add2
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-ADD-2
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2Add2(char[] value) {
      sf31IsoAvs2Ship2Add2 = checkSf31IsoAvs2Ship2Add2Constraints(value);
      serializeSf31IsoAvs2Ship2Add2(sf31IsoAvs2Ship2Add2);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2Add2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2Add2,sf31IsoAvs2Ship2Add2.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2Add2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add2,sf31IsoAvs2Ship2Add2.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2Add2 with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add2(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2Add2,SF_31_ISO_AVS_2_SHIP_2_ADD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add2,SF_31_ISO_AVS_2_SHIP_2_ADD_2_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Add2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Add2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Add2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2City
	 *	@return sf31IsoAvs2Ship2City
	 */
   public char[] getSf31IsoAvs2Ship2City() throws CFException{
     if (isSf31IsoAvs2Ship2CityModified()) { 
        sf31IsoAvs2Ship2City = refreshSf31IsoAvs2Ship2City();
     }
   		return sf31IsoAvs2Ship2City;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2City
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-CITY
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2City(char[] value) {
      sf31IsoAvs2Ship2City = checkSf31IsoAvs2Ship2CityConstraints(value);
      serializeSf31IsoAvs2Ship2City(sf31IsoAvs2Ship2City);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2City 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2City(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2City,sf31IsoAvs2Ship2City.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2City(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2City,sf31IsoAvs2Ship2City.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2City 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2City(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2City+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2City with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2City(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2City,SF_31_ISO_AVS_2_SHIP_2_CITY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2City 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2City(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2City,SF_31_ISO_AVS_2_SHIP_2_CITY_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2City 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2City(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2City+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2State
	 *	@return sf31IsoAvs2Ship2State
	 */
   public char[] getSf31IsoAvs2Ship2State() throws CFException{
     if (isSf31IsoAvs2Ship2StateModified()) { 
        sf31IsoAvs2Ship2State = refreshSf31IsoAvs2Ship2State();
     }
   		return sf31IsoAvs2Ship2State;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2State
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-STATE
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2State(char[] value) {
      sf31IsoAvs2Ship2State = checkSf31IsoAvs2Ship2StateConstraints(value);
      serializeSf31IsoAvs2Ship2State(sf31IsoAvs2Ship2State);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2State 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2State(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2State,sf31IsoAvs2Ship2State.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2State(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2State,sf31IsoAvs2Ship2State.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2State 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2State(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2State+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2State with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2State(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2State,SF_31_ISO_AVS_2_SHIP_2_STATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2State 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2State(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2State,SF_31_ISO_AVS_2_SHIP_2_STATE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2State 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2State(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2State+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2Postal
	 *	@return sf31IsoAvs2Ship2Postal
	 */
   public char[] getSf31IsoAvs2Ship2Postal() throws CFException{
     if (isSf31IsoAvs2Ship2PostalModified()) { 
        sf31IsoAvs2Ship2Postal = refreshSf31IsoAvs2Ship2Postal();
     }
   		return sf31IsoAvs2Ship2Postal;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2Postal
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-POSTAL
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2Postal(char[] value) {
      sf31IsoAvs2Ship2Postal = checkSf31IsoAvs2Ship2PostalConstraints(value);
      serializeSf31IsoAvs2Ship2Postal(sf31IsoAvs2Ship2Postal);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2Postal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Postal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2Postal,sf31IsoAvs2Ship2Postal.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2Postal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Postal,sf31IsoAvs2Ship2Postal.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Postal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Postal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Postal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2Postal with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Postal(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2Postal,SF_31_ISO_AVS_2_SHIP_2_POSTAL_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Postal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Postal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Postal,SF_31_ISO_AVS_2_SHIP_2_POSTAL_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Postal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Postal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Postal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2Ship2Country
	 *	@return sf31IsoAvs2Ship2Country
	 */
   public char[] getSf31IsoAvs2Ship2Country() throws CFException{
     if (isSf31IsoAvs2Ship2CountryModified()) { 
        sf31IsoAvs2Ship2Country = refreshSf31IsoAvs2Ship2Country();
     }
   		return sf31IsoAvs2Ship2Country;
   }

  
	/**
	*  set variable sf31IsoAvs2Ship2Country
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-SHIP2-COUNTRY
	*  @param value
	**/
   public void setSf31IsoAvs2Ship2Country(char[] value) {
      sf31IsoAvs2Ship2Country = checkSf31IsoAvs2Ship2CountryConstraints(value);
      serializeSf31IsoAvs2Ship2Country(sf31IsoAvs2Ship2Country);
   } 

     /**
	 * 	Update Sf31IsoAvs2Ship2Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Country(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2Ship2Country,sf31IsoAvs2Ship2Country.length);
   	
   }
   
   public void setSf31IsoAvs2Ship2Country(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Country,sf31IsoAvs2Ship2Country.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Country(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Country+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2Ship2Country with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Country(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2Ship2Country,SF_31_ISO_AVS_2_SHIP_2_COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Country(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Country,SF_31_ISO_AVS_2_SHIP_2_COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2Ship2Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2Ship2Country(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2Ship2Country+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2CurrencyCode
	 *	@return sf31IsoAvs2CurrencyCode
	 */
   public char[] getSf31IsoAvs2CurrencyCode() throws CFException{
     if (isSf31IsoAvs2CurrencyCodeModified()) { 
        sf31IsoAvs2CurrencyCode = refreshSf31IsoAvs2CurrencyCode();
     }
   		return sf31IsoAvs2CurrencyCode;
   }

  
	/**
	*  set variable sf31IsoAvs2CurrencyCode
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-CURRENCY-CODE
	*  @param value
	**/
   public void setSf31IsoAvs2CurrencyCode(char[] value) {
      sf31IsoAvs2CurrencyCode = checkSf31IsoAvs2CurrencyCodeConstraints(value);
      serializeSf31IsoAvs2CurrencyCode(sf31IsoAvs2CurrencyCode);
   } 

     /**
	 * 	Update Sf31IsoAvs2CurrencyCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2CurrencyCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2CurrencyCode,sf31IsoAvs2CurrencyCode.length);
   	
   }
   
   public void setSf31IsoAvs2CurrencyCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2CurrencyCode,sf31IsoAvs2CurrencyCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2CurrencyCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2CurrencyCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2CurrencyCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2CurrencyCode with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2CurrencyCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2CurrencyCode,SF_31_ISO_AVS_2_CURRENCY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2CurrencyCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2CurrencyCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2CurrencyCode,SF_31_ISO_AVS_2_CURRENCY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2CurrencyCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2CurrencyCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2CurrencyCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2RespCode
	 *	@return sf31IsoAvs2RespCode
	 */
   public char[] getSf31IsoAvs2RespCode() throws CFException{
     if (isSf31IsoAvs2RespCodeModified()) { 
        sf31IsoAvs2RespCode = refreshSf31IsoAvs2RespCode();
     }
   		return sf31IsoAvs2RespCode;
   }

  
	/**
	*  set variable sf31IsoAvs2RespCode
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-RESP-CODE
	*  @param value
	**/
   public void setSf31IsoAvs2RespCode(char[] value) {
      sf31IsoAvs2RespCode = checkSf31IsoAvs2RespCodeConstraints(value);
      serializeSf31IsoAvs2RespCode(sf31IsoAvs2RespCode);
   } 

     /**
	 * 	Update Sf31IsoAvs2RespCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2RespCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2RespCode,sf31IsoAvs2RespCode.length);
   	
   }
   
   public void setSf31IsoAvs2RespCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RespCode,sf31IsoAvs2RespCode.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2RespCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2RespCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RespCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2RespCode with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2RespCode(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2RespCode,SF_31_ISO_AVS_2_RESP_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2RespCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2RespCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RespCode,SF_31_ISO_AVS_2_RESP_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2RespCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2RespCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RespCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2PhoneNum
	 *	@return sf31IsoAvs2PhoneNum
	 */
   public char[] getSf31IsoAvs2PhoneNum() throws CFException{
     if (isSf31IsoAvs2PhoneNumModified()) { 
        sf31IsoAvs2PhoneNum = refreshSf31IsoAvs2PhoneNum();
     }
   		return sf31IsoAvs2PhoneNum;
   }

  
	/**
	*  set variable sf31IsoAvs2PhoneNum
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-PHONE-NUM
	*  @param value
	**/
   public void setSf31IsoAvs2PhoneNum(char[] value) {
      sf31IsoAvs2PhoneNum = checkSf31IsoAvs2PhoneNumConstraints(value);
      serializeSf31IsoAvs2PhoneNum(sf31IsoAvs2PhoneNum);
   } 

     /**
	 * 	Update Sf31IsoAvs2PhoneNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2PhoneNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2PhoneNum,sf31IsoAvs2PhoneNum.length);
   	
   }
   
   public void setSf31IsoAvs2PhoneNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2PhoneNum,sf31IsoAvs2PhoneNum.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2PhoneNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2PhoneNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2PhoneNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2PhoneNum with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2PhoneNum(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2PhoneNum,SF_31_ISO_AVS_2_PHONE_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2PhoneNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2PhoneNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2PhoneNum,SF_31_ISO_AVS_2_PHONE_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2PhoneNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2PhoneNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2PhoneNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2FraudAlert
	 *	@return sf31IsoAvs2FraudAlert
	 */
   public char[] getSf31IsoAvs2FraudAlert() throws CFException{
     if (isSf31IsoAvs2FraudAlertModified()) { 
        sf31IsoAvs2FraudAlert = refreshSf31IsoAvs2FraudAlert();
     }
   		return sf31IsoAvs2FraudAlert;
   }

  
	/**
	*  set variable sf31IsoAvs2FraudAlert
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-FRAUD-ALERT
	*  @param value
	**/
   public void setSf31IsoAvs2FraudAlert(char[] value) {
      sf31IsoAvs2FraudAlert = checkSf31IsoAvs2FraudAlertConstraints(value);
      serializeSf31IsoAvs2FraudAlert(sf31IsoAvs2FraudAlert);
   } 

     /**
	 * 	Update Sf31IsoAvs2FraudAlert 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2FraudAlert(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2FraudAlert,sf31IsoAvs2FraudAlert.length);
   	
   }
   
   public void setSf31IsoAvs2FraudAlert(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2FraudAlert,sf31IsoAvs2FraudAlert.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2FraudAlert 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2FraudAlert(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2FraudAlert+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2FraudAlert with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2FraudAlert(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2FraudAlert,SF_31_ISO_AVS_2_FRAUD_ALERT_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2FraudAlert 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2FraudAlert(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2FraudAlert,SF_31_ISO_AVS_2_FRAUD_ALERT_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2FraudAlert 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2FraudAlert(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2FraudAlert+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf31IsoAvs2RushOrder
	 *	@return sf31IsoAvs2RushOrder
	 */
   public char[] getSf31IsoAvs2RushOrder() throws CFException{
     if (isSf31IsoAvs2RushOrderModified()) { 
        sf31IsoAvs2RushOrder = refreshSf31IsoAvs2RushOrder();
     }
   		return sf31IsoAvs2RushOrder;
   }

  
	/**
	*  set variable sf31IsoAvs2RushOrder
	*  Corresponding COBOL Variable is SF31-ISO-AVS2-RUSH-ORDER
	*  @param value
	**/
   public void setSf31IsoAvs2RushOrder(char[] value) {
      sf31IsoAvs2RushOrder = checkSf31IsoAvs2RushOrderConstraints(value);
      serializeSf31IsoAvs2RushOrder(sf31IsoAvs2RushOrder);
   } 

     /**
	 * 	Update Sf31IsoAvs2RushOrder 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoAvs2RushOrder(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoAvs2RushOrder,sf31IsoAvs2RushOrder.length);
   	
   }
   
   public void setSf31IsoAvs2RushOrder(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RushOrder,sf31IsoAvs2RushOrder.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2RushOrder 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2RushOrder(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RushOrder+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoAvs2RushOrder with another Field
	 *	@param value
	 */
   public void setSf31IsoAvs2RushOrder(Field source) {
       replace(source,0,source.length(),beginSf31IsoAvs2RushOrder,SF_31_ISO_AVS_2_RUSH_ORDER_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoAvs2RushOrder 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoAvs2RushOrder(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RushOrder,SF_31_ISO_AVS_2_RUSH_ORDER_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoAvs2RushOrder 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoAvs2RushOrder(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoAvs2RushOrder+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf31IsoAddlAvsiiFieldLength() {
			return SF_31_ISO_ADDL_AVSII_LENGTH;
		}

}
  
