package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip00724TableEntry")

public class Ip00724TableEntry extends Ip00724TableEntrySerialized  implements InitializingBean {
   
				private Ip00724Key ip00724Key = new Ip00724Key();

						private char[] ip00724Filler3 = Field.fillLowValue(1);

						private char[] ip00724Filler4 = Field.fillLowValue(1);

						private char[] ip00724IchgReg = Field.fillLowValue(1);
				private Ip00724Ichg ip00724Ichg = new Ip00724Ichg();

						private char[] ip00724ElectronicQualifier = Field.fillLowValue(2);

						private char[] ip00724IntUseIca = Field.fillLowValue(1);

						private char[] ip00724AcqSw = Field.fillLowValue(1);

						private char[] ip00724AtmInd = Field.fillLowValue(1);

						private char[] ip00724RclRegion = Field.fillLowValue(1);

								private long ip00724Endpoint;

						private char[] ip00724WorldIcaChbSw = Field.fillLowValue(1);

						private char[] ip00724WorldGrpChbSw1 = Field.fillLowValue(1);

						private char[] ip00724WorldGrpChbSw2 = Field.fillLowValue(1);

						private char[] ip00724WorldGrpChbSw3 = Field.fillLowValue(1);

						private char[] ip00724WorldGrpChbSw4 = Field.fillLowValue(1);

						private char[] ip00724WorldGrpChbSw5 = Field.fillLowValue(1);

						private char[] ip00724Filler5 = Field.fillLowValue(1);

						private char[] ip00724MemberName = Field.fillLowValue(30);

						private char[] ip00724CountryCode = Field.fillLowValue(3);

								private int ip00724CountryIso;

						private char[] ip00724ChbConvExclId = Field.fillLowValue(1);

								private long ip00724ChbConvExprDt;

						private char[] ip00724ChbEditExcl = Field.fillLowValue(1);

						private char[] ip00724HardshipEffectInd = Field.fillLowValue(1);

								private long ip00724HardshipEffectDate;

								private long ip00724HardshipExpireDate;

						private char[] ip00724FormatIndicator = Field.fillLowValue(1);

						private char[] ip00724McePartcptnCd = Field.fillLowValue(1);

						private char[] ip00724EeaAcqCtrySrvIca = Field.fillLowValue(1);

						private char[] ip00724IrdDeterminePart = Field.fillLowValue(1);

						private char[] ip00724NpgAcqProcInd = Field.fillLowValue(1);

						private char[] ip00724PtaParticipantInd = Field.fillLowValue(1);

						private char[] ip00724MemberFiller = Field.fillLowValue(8);
				private Ip00724CentralSiteFields ip00724CentralSiteFields = new Ip00724CentralSiteFields();
	
	/**
	* Constructor for Ip00724TableEntry
	**/
    public Ip00724TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00724Key.setParent(this,getStartOffset() + 0);
	       			ip00724Ichg.setParent(this,getStartOffset() + 13);
	       			ip00724CentralSiteFields.setParent(this,getStartOffset() + 105);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00724Key
	 *	@return ip00724Key
	 */   
	 public Ip00724Key getIp00724Key() {
   	return ip00724Key;
   }
   /**
	* 	Update Ip00724Key with the passed value
	*   Corresponding COBOL Variable is IP00724-KEY
	*	@param value
	*/
   public void setIp00724Key(char[] value) {
      ip00724Key.setString(value); 
   }   
    
     /**
	 * 	Update Ip00724Key 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00724Key(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Key.begin,ip00724Key.length());
   }
   
     /**
	 * 	Update Ip00724Key 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Key.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00724Key with another Field
	 *	@param value
	 */
   public void setIp00724Key(Field source) {
   	replace(source,0,source.length(),ip00724Key.begin,ip00724Key.length());
   }  
   
     /**
	 * 	Update Ip00724Key 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00724Key(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Key.begin,ip00724Key.length());
   }
   
     /**
	 * 	Update Ip00724Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Key.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00724Filler3
	 *	@return ip00724Filler3
	 */
   public char[] getIp00724Filler3() throws CFException{
     if (isIp00724Filler3Modified()) { 
        ip00724Filler3 = refreshIp00724Filler3();
     }
   		return ip00724Filler3;
   }

  
	/**
	*  set variable ip00724Filler3
	*  Corresponding COBOL Variable is IP00724-FILLER3
	*  @param value
	**/
   public void setIp00724Filler3(char[] value) {
      ip00724Filler3 = checkIp00724Filler3Constraints(value);
      serializeIp00724Filler3(ip00724Filler3);
   } 

     /**
	 * 	Update Ip00724Filler3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724Filler3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724Filler3,ip00724Filler3.length);
   	
   }
   
   public void setIp00724Filler3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler3,ip00724Filler3.length);
   	
   }
   
     /**
	 * 	Update Ip00724Filler3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724Filler3 with another Field
	 *	@param value
	 */
   public void setIp00724Filler3(Field source) {
       replace(source,0,source.length(),beginIp00724Filler3,IP_00724_FILLER_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724Filler3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724Filler3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724Filler3,IP_00724_FILLER_3_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724Filler3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724Filler4
	 *	@return ip00724Filler4
	 */
   public char[] getIp00724Filler4() throws CFException{
     if (isIp00724Filler4Modified()) { 
        ip00724Filler4 = refreshIp00724Filler4();
     }
   		return ip00724Filler4;
   }

  
	/**
	*  set variable ip00724Filler4
	*  Corresponding COBOL Variable is IP00724-FILLER4
	*  @param value
	**/
   public void setIp00724Filler4(char[] value) {
      ip00724Filler4 = checkIp00724Filler4Constraints(value);
      serializeIp00724Filler4(ip00724Filler4);
   } 

     /**
	 * 	Update Ip00724Filler4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724Filler4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724Filler4,ip00724Filler4.length);
   	
   }
   
   public void setIp00724Filler4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler4,ip00724Filler4.length);
   	
   }
   
     /**
	 * 	Update Ip00724Filler4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724Filler4 with another Field
	 *	@param value
	 */
   public void setIp00724Filler4(Field source) {
       replace(source,0,source.length(),beginIp00724Filler4,IP_00724_FILLER_4_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724Filler4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724Filler4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724Filler4,IP_00724_FILLER_4_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724Filler4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724IchgReg
	 *	@return ip00724IchgReg
	 */
   public char[] getIp00724IchgReg() throws CFException{
     if (isIp00724IchgRegModified()) { 
        ip00724IchgReg = refreshIp00724IchgReg();
     }
   		return ip00724IchgReg;
   }

  
	/**
	*  set variable ip00724IchgReg
	*  Corresponding COBOL Variable is IP00724-ICHG-REG
	*  @param value
	**/
   public void setIp00724IchgReg(char[] value) {
      ip00724IchgReg = checkIp00724IchgRegConstraints(value);
      serializeIp00724IchgReg(ip00724IchgReg);
   } 

     /**
	 * 	Update Ip00724IchgReg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IchgReg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IchgReg,ip00724IchgReg.length);
   	
   }
   
   public void setIp00724IchgReg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgReg,ip00724IchgReg.length);
   	
   }
   
     /**
	 * 	Update Ip00724IchgReg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgReg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgReg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IchgReg with another Field
	 *	@param value
	 */
   public void setIp00724IchgReg(Field source) {
       replace(source,0,source.length(),beginIp00724IchgReg,IP_00724_ICHG_REG_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IchgReg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IchgReg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IchgReg,IP_00724_ICHG_REG_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IchgReg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgReg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgReg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724Ichg
	 *	@return ip00724Ichg
	 */   
	 public Ip00724Ichg getIp00724Ichg() {
   	return ip00724Ichg;
   }
   /**
	* 	Update Ip00724Ichg with the passed value
	*   Corresponding COBOL Variable is IP00724-ICHG
	*	@param value
	*/
   public void setIp00724Ichg(char[] value) {
      ip00724Ichg.setString(value); 
   }   
    
     /**
	 * 	Update Ip00724Ichg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00724Ichg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Ichg.begin,ip00724Ichg.length());
   }
   
     /**
	 * 	Update Ip00724Ichg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Ichg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Ichg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00724Ichg with another Field
	 *	@param value
	 */
   public void setIp00724Ichg(Field source) {
   	replace(source,0,source.length(),ip00724Ichg.begin,ip00724Ichg.length());
   }  
   
     /**
	 * 	Update Ip00724Ichg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00724Ichg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Ichg.begin,ip00724Ichg.length());
   }
   
     /**
	 * 	Update Ip00724Ichg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Ichg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724Ichg.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00724ElectronicQualifier
	 *	@return ip00724ElectronicQualifier
	 */
   public char[] getIp00724ElectronicQualifier() throws CFException{
     if (isIp00724ElectronicQualifierModified()) { 
        ip00724ElectronicQualifier = refreshIp00724ElectronicQualifier();
     }
   		return ip00724ElectronicQualifier;
   }

  
	/**
	*  set variable ip00724ElectronicQualifier
	*  Corresponding COBOL Variable is IP00724-ELECTRONIC-QUALIFIER
	*  @param value
	**/
   public void setIp00724ElectronicQualifier(char[] value) {
      ip00724ElectronicQualifier = checkIp00724ElectronicQualifierConstraints(value);
      serializeIp00724ElectronicQualifier(ip00724ElectronicQualifier);
   } 

     /**
	 * 	Update Ip00724ElectronicQualifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724ElectronicQualifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724ElectronicQualifier,ip00724ElectronicQualifier.length);
   	
   }
   
   public void setIp00724ElectronicQualifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ElectronicQualifier,ip00724ElectronicQualifier.length);
   	
   }
   
     /**
	 * 	Update Ip00724ElectronicQualifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ElectronicQualifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ElectronicQualifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724ElectronicQualifier with another Field
	 *	@param value
	 */
   public void setIp00724ElectronicQualifier(Field source) {
       replace(source,0,source.length(),beginIp00724ElectronicQualifier,IP_00724_ELECTRONIC_QUALIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724ElectronicQualifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724ElectronicQualifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724ElectronicQualifier,IP_00724_ELECTRONIC_QUALIFIER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724ElectronicQualifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ElectronicQualifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ElectronicQualifier+targetIndex,targetLen);
    
   }
	char[] ip00724IeiQualified8888Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isIp00724IeiQualified88()
	 *	@return  Returns true if isIp00724IeiQualified88() is "01"
	 */
   public boolean isIp00724IeiQualified88() throws CFException {
      return (  compareChars( getIp00724ElectronicQualifier() , ip00724IeiQualified8888Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setIp00724IeiQualified88True() {  			
    	setIp00724ElectronicQualifier( ip00724IeiQualified8888Value);
   	}
	char[] ip00724NotIeiQualified8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isIp00724NotIeiQualified88()
	 *	@return  Returns true if isIp00724NotIeiQualified88() is "00"
	 */
   public boolean isIp00724NotIeiQualified88() throws CFException {
      return (  compareChars( getIp00724ElectronicQualifier() , ip00724NotIeiQualified8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setIp00724NotIeiQualified88True() {  			
    	setIp00724ElectronicQualifier( ip00724NotIeiQualified8888Value);
   	}
	/**
	 *	Returns the value of ip00724IntUseIca
	 *	@return ip00724IntUseIca
	 */
   public char[] getIp00724IntUseIca() throws CFException{
     if (isIp00724IntUseIcaModified()) { 
        ip00724IntUseIca = refreshIp00724IntUseIca();
     }
   		return ip00724IntUseIca;
   }

  
	/**
	*  set variable ip00724IntUseIca
	*  Corresponding COBOL Variable is IP00724-INT-USE-ICA
	*  @param value
	**/
   public void setIp00724IntUseIca(char[] value) {
      ip00724IntUseIca = checkIp00724IntUseIcaConstraints(value);
      serializeIp00724IntUseIca(ip00724IntUseIca);
   } 

     /**
	 * 	Update Ip00724IntUseIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IntUseIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IntUseIca,ip00724IntUseIca.length);
   	
   }
   
   public void setIp00724IntUseIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IntUseIca,ip00724IntUseIca.length);
   	
   }
   
     /**
	 * 	Update Ip00724IntUseIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IntUseIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IntUseIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IntUseIca with another Field
	 *	@param value
	 */
   public void setIp00724IntUseIca(Field source) {
       replace(source,0,source.length(),beginIp00724IntUseIca,IP_00724_INT_USE_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IntUseIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IntUseIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IntUseIca,IP_00724_INT_USE_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IntUseIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IntUseIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IntUseIca+targetIndex,targetLen);
    
   }
	char[] ip00724NoIntUse8888Value1 = " ".toCharArray();
char[] ip00724NoIntUse8888Value2 = "N".toCharArray();

	/**
	 *	Test condition " " "N" for isIp00724NoIntUse88()
	 *	@return  Returns true if isIp00724NoIntUse88() is " " "N"
	 */
   public boolean isIp00724NoIntUse88() throws CFException {
      return (  compareChars( getIp00724IntUseIca() , ip00724NoIntUse8888Value1)  == 0  ||  compareChars( getIp00724IntUseIca() , ip00724NoIntUse8888Value2)  == 0  );
   }


	/**
	*  set values " " "N"
	*/
   	public void setIp00724NoIntUse88True() {  			
    	setIp00724IntUseIca( ip00724NoIntUse8888Value1);
   	}
	char[] ip00724NoDbCr8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp00724NoDbCr88()
	 *	@return  Returns true if isIp00724NoDbCr88() is "B"
	 */
   public boolean isIp00724NoDbCr88() throws CFException {
      return (  compareChars( getIp00724IntUseIca() , ip00724NoDbCr8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp00724NoDbCr88True() {  			
    	setIp00724IntUseIca( ip00724NoDbCr8888Value);
   	}
	char[] ip00724NoCr8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp00724NoCr88()
	 *	@return  Returns true if isIp00724NoCr88() is "C"
	 */
   public boolean isIp00724NoCr88() throws CFException {
      return (  compareChars( getIp00724IntUseIca() , ip00724NoCr8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp00724NoCr88True() {  			
    	setIp00724IntUseIca( ip00724NoCr8888Value);
   	}
	char[] ip00724NoDb8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp00724NoDb88()
	 *	@return  Returns true if isIp00724NoDb88() is "D"
	 */
   public boolean isIp00724NoDb88() throws CFException {
      return (  compareChars( getIp00724IntUseIca() , ip00724NoDb8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp00724NoDb88True() {  			
    	setIp00724IntUseIca( ip00724NoDb8888Value);
   	}
	/**
	 *	Returns the value of ip00724AcqSw
	 *	@return ip00724AcqSw
	 */
   public char[] getIp00724AcqSw() throws CFException{
     if (isIp00724AcqSwModified()) { 
        ip00724AcqSw = refreshIp00724AcqSw();
     }
   		return ip00724AcqSw;
   }

  
	/**
	*  set variable ip00724AcqSw
	*  Corresponding COBOL Variable is IP00724-ACQ-SW
	*  @param value
	**/
   public void setIp00724AcqSw(char[] value) {
      ip00724AcqSw = checkIp00724AcqSwConstraints(value);
      serializeIp00724AcqSw(ip00724AcqSw);
   } 

     /**
	 * 	Update Ip00724AcqSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AcqSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AcqSw,ip00724AcqSw.length);
   	
   }
   
   public void setIp00724AcqSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqSw,ip00724AcqSw.length);
   	
   }
   
     /**
	 * 	Update Ip00724AcqSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AcqSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AcqSw with another Field
	 *	@param value
	 */
   public void setIp00724AcqSw(Field source) {
       replace(source,0,source.length(),beginIp00724AcqSw,IP_00724_ACQ_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AcqSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AcqSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AcqSw,IP_00724_ACQ_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AcqSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AcqSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AcqSw+targetIndex,targetLen);
    
   }
	char[] ip00724AcqOnly8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp00724AcqOnly88()
	 *	@return  Returns true if isIp00724AcqOnly88() is "A"
	 */
   public boolean isIp00724AcqOnly88() throws CFException {
      return (  compareChars( getIp00724AcqSw() , ip00724AcqOnly8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp00724AcqOnly88True() {  			
    	setIp00724AcqSw( ip00724AcqOnly8888Value);
   	}
	char[] ip00724IssOnly8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp00724IssOnly88()
	 *	@return  Returns true if isIp00724IssOnly88() is "I"
	 */
   public boolean isIp00724IssOnly88() throws CFException {
      return (  compareChars( getIp00724AcqSw() , ip00724IssOnly8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp00724IssOnly88True() {  			
    	setIp00724AcqSw( ip00724IssOnly8888Value);
   	}
	/**
	 *	Returns the value of ip00724AtmInd
	 *	@return ip00724AtmInd
	 */
   public char[] getIp00724AtmInd() throws CFException{
     if (isIp00724AtmIndModified()) { 
        ip00724AtmInd = refreshIp00724AtmInd();
     }
   		return ip00724AtmInd;
   }

  
	/**
	*  set variable ip00724AtmInd
	*  Corresponding COBOL Variable is IP00724-ATM-IND
	*  @param value
	**/
   public void setIp00724AtmInd(char[] value) {
      ip00724AtmInd = checkIp00724AtmIndConstraints(value);
      serializeIp00724AtmInd(ip00724AtmInd);
   } 

     /**
	 * 	Update Ip00724AtmInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724AtmInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724AtmInd,ip00724AtmInd.length);
   	
   }
   
   public void setIp00724AtmInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AtmInd,ip00724AtmInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724AtmInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AtmInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AtmInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724AtmInd with another Field
	 *	@param value
	 */
   public void setIp00724AtmInd(Field source) {
       replace(source,0,source.length(),beginIp00724AtmInd,IP_00724_ATM_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724AtmInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724AtmInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724AtmInd,IP_00724_ATM_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724AtmInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724AtmInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724AtmInd+targetIndex,targetLen);
    
   }
	char[] ip00724NotAtm8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp00724NotAtm88()
	 *	@return  Returns true if isIp00724NotAtm88() is " "
	 */
   public boolean isIp00724NotAtm88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724NotAtm8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp00724NotAtm88True() {  			
    	setIp00724AtmInd( ip00724NotAtm8888Value);
   	}
	char[] ip00724AtmAcq8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp00724AtmAcq88()
	 *	@return  Returns true if isIp00724AtmAcq88() is "1"
	 */
   public boolean isIp00724AtmAcq88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724AtmAcq8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp00724AtmAcq88True() {  			
    	setIp00724AtmInd( ip00724AtmAcq8888Value);
   	}
	char[] ip00724AtmIss8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp00724AtmIss88()
	 *	@return  Returns true if isIp00724AtmIss88() is "2"
	 */
   public boolean isIp00724AtmIss88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724AtmIss8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp00724AtmIss88True() {  			
    	setIp00724AtmInd( ip00724AtmIss8888Value);
   	}
	char[] ip00724AcqIss8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp00724AcqIss88()
	 *	@return  Returns true if isIp00724AcqIss88() is "3"
	 */
   public boolean isIp00724AcqIss88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724AcqIss8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp00724AcqIss88True() {  			
    	setIp00724AtmInd( ip00724AcqIss8888Value);
   	}
	char[] ip00724MdsPrc8888Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isIp00724MdsPrc88()
	 *	@return  Returns true if isIp00724MdsPrc88() is "4"
	 */
   public boolean isIp00724MdsPrc88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724MdsPrc8888Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setIp00724MdsPrc88True() {  			
    	setIp00724AtmInd( ip00724MdsPrc8888Value);
   	}
	char[] ip00724NonmdsEuro8888Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isIp00724NonmdsEuro88()
	 *	@return  Returns true if isIp00724NonmdsEuro88() is "5"
	 */
   public boolean isIp00724NonmdsEuro88() throws CFException {
      return (  compareChars( getIp00724AtmInd() , ip00724NonmdsEuro8888Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setIp00724NonmdsEuro88True() {  			
    	setIp00724AtmInd( ip00724NonmdsEuro8888Value);
   	}
	/**
	 *	Returns the value of ip00724RclRegion
	 *	@return ip00724RclRegion
	 */
   public char[] getIp00724RclRegion() throws CFException{
     if (isIp00724RclRegionModified()) { 
        ip00724RclRegion = refreshIp00724RclRegion();
     }
   		return ip00724RclRegion;
   }

  
	/**
	*  set variable ip00724RclRegion
	*  Corresponding COBOL Variable is IP00724-RCL-REGION
	*  @param value
	**/
   public void setIp00724RclRegion(char[] value) {
      ip00724RclRegion = checkIp00724RclRegionConstraints(value);
      serializeIp00724RclRegion(ip00724RclRegion);
   } 

     /**
	 * 	Update Ip00724RclRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724RclRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724RclRegion,ip00724RclRegion.length);
   	
   }
   
   public void setIp00724RclRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RclRegion,ip00724RclRegion.length);
   	
   }
   
     /**
	 * 	Update Ip00724RclRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724RclRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RclRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724RclRegion with another Field
	 *	@param value
	 */
   public void setIp00724RclRegion(Field source) {
       replace(source,0,source.length(),beginIp00724RclRegion,IP_00724_RCL_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724RclRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724RclRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724RclRegion,IP_00724_RCL_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724RclRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724RclRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724RclRegion+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724Endpoint
	 *	@return ip00724Endpoint
	 */
	public long getIp00724Endpoint() throws CFException {
       if (isIp00724EndpointModified()) { 
           ip00724Endpoint = refreshIp00724Endpoint();
        }
   		return ip00724Endpoint;
	}
	

	
	   
	/**
	 * 	Update Ip00724Endpoint with the passed value
	 *  Corresponding COBOL Variable is IP00724-ENDPOINT
	 *	@param number
	 */
	public void setIp00724Endpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724Endpoint = checkIp00724EndpointMaxLimit(number); 
		serializeIp00724Endpoint(ip00724Endpoint);
	}
	

	/**
	 * 	Update Ip00724Endpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724Endpoint(char[] value) throws CFException {
		 ip00724Endpoint = serializeIp00724Endpoint(value);
	}
	/**
	 * 	Update Ip00724Endpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724EndpointString(char[] value) throws CFException {
		 setIp00724Endpoint(value);
	}
	/**
	 *	Returns the value of ip00724WorldIcaChbSw
	 *	@return ip00724WorldIcaChbSw
	 */
   public char[] getIp00724WorldIcaChbSw() throws CFException{
     if (isIp00724WorldIcaChbSwModified()) { 
        ip00724WorldIcaChbSw = refreshIp00724WorldIcaChbSw();
     }
   		return ip00724WorldIcaChbSw;
   }

  
	/**
	*  set variable ip00724WorldIcaChbSw
	*  Corresponding COBOL Variable is IP00724-WORLD-ICA-CHB-SW
	*  @param value
	**/
   public void setIp00724WorldIcaChbSw(char[] value) {
      ip00724WorldIcaChbSw = checkIp00724WorldIcaChbSwConstraints(value);
      serializeIp00724WorldIcaChbSw(ip00724WorldIcaChbSw);
   } 

     /**
	 * 	Update Ip00724WorldIcaChbSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldIcaChbSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldIcaChbSw,ip00724WorldIcaChbSw.length);
   	
   }
   
   public void setIp00724WorldIcaChbSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldIcaChbSw,ip00724WorldIcaChbSw.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldIcaChbSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldIcaChbSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldIcaChbSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldIcaChbSw with another Field
	 *	@param value
	 */
   public void setIp00724WorldIcaChbSw(Field source) {
       replace(source,0,source.length(),beginIp00724WorldIcaChbSw,IP_00724_WORLD_ICA_CHB_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldIcaChbSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldIcaChbSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldIcaChbSw,IP_00724_WORLD_ICA_CHB_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldIcaChbSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldIcaChbSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldIcaChbSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724WorldGrpChbSw1
	 *	@return ip00724WorldGrpChbSw1
	 */
   public char[] getIp00724WorldGrpChbSw1() throws CFException{
     if (isIp00724WorldGrpChbSw1Modified()) { 
        ip00724WorldGrpChbSw1 = refreshIp00724WorldGrpChbSw1();
     }
   		return ip00724WorldGrpChbSw1;
   }

  
	/**
	*  set variable ip00724WorldGrpChbSw1
	*  Corresponding COBOL Variable is IP00724-WORLD-GRP-CHB-SW1
	*  @param value
	**/
   public void setIp00724WorldGrpChbSw1(char[] value) {
      ip00724WorldGrpChbSw1 = checkIp00724WorldGrpChbSw1Constraints(value);
      serializeIp00724WorldGrpChbSw1(ip00724WorldGrpChbSw1);
   } 

     /**
	 * 	Update Ip00724WorldGrpChbSw1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldGrpChbSw1,ip00724WorldGrpChbSw1.length);
   	
   }
   
   public void setIp00724WorldGrpChbSw1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw1,ip00724WorldGrpChbSw1.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldGrpChbSw1 with another Field
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw1(Field source) {
       replace(source,0,source.length(),beginIp00724WorldGrpChbSw1,IP_00724_WORLD_GRP_CHB_SW_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldGrpChbSw1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw1,IP_00724_WORLD_GRP_CHB_SW_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724WorldGrpChbSw2
	 *	@return ip00724WorldGrpChbSw2
	 */
   public char[] getIp00724WorldGrpChbSw2() throws CFException{
     if (isIp00724WorldGrpChbSw2Modified()) { 
        ip00724WorldGrpChbSw2 = refreshIp00724WorldGrpChbSw2();
     }
   		return ip00724WorldGrpChbSw2;
   }

  
	/**
	*  set variable ip00724WorldGrpChbSw2
	*  Corresponding COBOL Variable is IP00724-WORLD-GRP-CHB-SW2
	*  @param value
	**/
   public void setIp00724WorldGrpChbSw2(char[] value) {
      ip00724WorldGrpChbSw2 = checkIp00724WorldGrpChbSw2Constraints(value);
      serializeIp00724WorldGrpChbSw2(ip00724WorldGrpChbSw2);
   } 

     /**
	 * 	Update Ip00724WorldGrpChbSw2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldGrpChbSw2,ip00724WorldGrpChbSw2.length);
   	
   }
   
   public void setIp00724WorldGrpChbSw2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw2,ip00724WorldGrpChbSw2.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldGrpChbSw2 with another Field
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw2(Field source) {
       replace(source,0,source.length(),beginIp00724WorldGrpChbSw2,IP_00724_WORLD_GRP_CHB_SW_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldGrpChbSw2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw2,IP_00724_WORLD_GRP_CHB_SW_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724WorldGrpChbSw3
	 *	@return ip00724WorldGrpChbSw3
	 */
   public char[] getIp00724WorldGrpChbSw3() throws CFException{
     if (isIp00724WorldGrpChbSw3Modified()) { 
        ip00724WorldGrpChbSw3 = refreshIp00724WorldGrpChbSw3();
     }
   		return ip00724WorldGrpChbSw3;
   }

  
	/**
	*  set variable ip00724WorldGrpChbSw3
	*  Corresponding COBOL Variable is IP00724-WORLD-GRP-CHB-SW3
	*  @param value
	**/
   public void setIp00724WorldGrpChbSw3(char[] value) {
      ip00724WorldGrpChbSw3 = checkIp00724WorldGrpChbSw3Constraints(value);
      serializeIp00724WorldGrpChbSw3(ip00724WorldGrpChbSw3);
   } 

     /**
	 * 	Update Ip00724WorldGrpChbSw3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldGrpChbSw3,ip00724WorldGrpChbSw3.length);
   	
   }
   
   public void setIp00724WorldGrpChbSw3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw3,ip00724WorldGrpChbSw3.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldGrpChbSw3 with another Field
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw3(Field source) {
       replace(source,0,source.length(),beginIp00724WorldGrpChbSw3,IP_00724_WORLD_GRP_CHB_SW_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldGrpChbSw3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw3,IP_00724_WORLD_GRP_CHB_SW_3_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724WorldGrpChbSw4
	 *	@return ip00724WorldGrpChbSw4
	 */
   public char[] getIp00724WorldGrpChbSw4() throws CFException{
     if (isIp00724WorldGrpChbSw4Modified()) { 
        ip00724WorldGrpChbSw4 = refreshIp00724WorldGrpChbSw4();
     }
   		return ip00724WorldGrpChbSw4;
   }

  
	/**
	*  set variable ip00724WorldGrpChbSw4
	*  Corresponding COBOL Variable is IP00724-WORLD-GRP-CHB-SW4
	*  @param value
	**/
   public void setIp00724WorldGrpChbSw4(char[] value) {
      ip00724WorldGrpChbSw4 = checkIp00724WorldGrpChbSw4Constraints(value);
      serializeIp00724WorldGrpChbSw4(ip00724WorldGrpChbSw4);
   } 

     /**
	 * 	Update Ip00724WorldGrpChbSw4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldGrpChbSw4,ip00724WorldGrpChbSw4.length);
   	
   }
   
   public void setIp00724WorldGrpChbSw4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw4,ip00724WorldGrpChbSw4.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldGrpChbSw4 with another Field
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw4(Field source) {
       replace(source,0,source.length(),beginIp00724WorldGrpChbSw4,IP_00724_WORLD_GRP_CHB_SW_4_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldGrpChbSw4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw4,IP_00724_WORLD_GRP_CHB_SW_4_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724WorldGrpChbSw5
	 *	@return ip00724WorldGrpChbSw5
	 */
   public char[] getIp00724WorldGrpChbSw5() throws CFException{
     if (isIp00724WorldGrpChbSw5Modified()) { 
        ip00724WorldGrpChbSw5 = refreshIp00724WorldGrpChbSw5();
     }
   		return ip00724WorldGrpChbSw5;
   }

  
	/**
	*  set variable ip00724WorldGrpChbSw5
	*  Corresponding COBOL Variable is IP00724-WORLD-GRP-CHB-SW5
	*  @param value
	**/
   public void setIp00724WorldGrpChbSw5(char[] value) {
      ip00724WorldGrpChbSw5 = checkIp00724WorldGrpChbSw5Constraints(value);
      serializeIp00724WorldGrpChbSw5(ip00724WorldGrpChbSw5);
   } 

     /**
	 * 	Update Ip00724WorldGrpChbSw5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724WorldGrpChbSw5,ip00724WorldGrpChbSw5.length);
   	
   }
   
   public void setIp00724WorldGrpChbSw5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw5,ip00724WorldGrpChbSw5.length);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724WorldGrpChbSw5 with another Field
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw5(Field source) {
       replace(source,0,source.length(),beginIp00724WorldGrpChbSw5,IP_00724_WORLD_GRP_CHB_SW_5_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724WorldGrpChbSw5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw5,IP_00724_WORLD_GRP_CHB_SW_5_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724WorldGrpChbSw5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724WorldGrpChbSw5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724WorldGrpChbSw5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724Filler5
	 *	@return ip00724Filler5
	 */
   public char[] getIp00724Filler5() throws CFException{
     if (isIp00724Filler5Modified()) { 
        ip00724Filler5 = refreshIp00724Filler5();
     }
   		return ip00724Filler5;
   }

  
	/**
	*  set variable ip00724Filler5
	*  Corresponding COBOL Variable is IP00724-FILLER5
	*  @param value
	**/
   public void setIp00724Filler5(char[] value) {
      ip00724Filler5 = checkIp00724Filler5Constraints(value);
      serializeIp00724Filler5(ip00724Filler5);
   } 

     /**
	 * 	Update Ip00724Filler5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724Filler5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724Filler5,ip00724Filler5.length);
   	
   }
   
   public void setIp00724Filler5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler5,ip00724Filler5.length);
   	
   }
   
     /**
	 * 	Update Ip00724Filler5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724Filler5 with another Field
	 *	@param value
	 */
   public void setIp00724Filler5(Field source) {
       replace(source,0,source.length(),beginIp00724Filler5,IP_00724_FILLER_5_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724Filler5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724Filler5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724Filler5,IP_00724_FILLER_5_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724Filler5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724Filler5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724Filler5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724MemberName
	 *	@return ip00724MemberName
	 */
   public char[] getIp00724MemberName() throws CFException{
     if (isIp00724MemberNameModified()) { 
        ip00724MemberName = refreshIp00724MemberName();
     }
   		return ip00724MemberName;
   }

  
	/**
	*  set variable ip00724MemberName
	*  Corresponding COBOL Variable is IP00724-MEMBER-NAME
	*  @param value
	**/
   public void setIp00724MemberName(char[] value) {
      ip00724MemberName = checkIp00724MemberNameConstraints(value);
      serializeIp00724MemberName(ip00724MemberName);
   } 

     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724MemberName,ip00724MemberName.length);
   	
   }
   
   public void setIp00724MemberName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberName,ip00724MemberName.length);
   	
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724MemberName with another Field
	 *	@param value
	 */
   public void setIp00724MemberName(Field source) {
       replace(source,0,source.length(),beginIp00724MemberName,IP_00724_MEMBER_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724MemberName,IP_00724_MEMBER_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724MemberName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724CountryCode
	 *	@return ip00724CountryCode
	 */
   public char[] getIp00724CountryCode() throws CFException{
     if (isIp00724CountryCodeModified()) { 
        ip00724CountryCode = refreshIp00724CountryCode();
     }
   		return ip00724CountryCode;
   }

  
	/**
	*  set variable ip00724CountryCode
	*  Corresponding COBOL Variable is IP00724-COUNTRY-CODE
	*  @param value
	**/
   public void setIp00724CountryCode(char[] value) {
      ip00724CountryCode = checkIp00724CountryCodeConstraints(value);
      serializeIp00724CountryCode(ip00724CountryCode);
   } 

     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724CountryCode,ip00724CountryCode.length);
   	
   }
   
   public void setIp00724CountryCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724CountryCode,ip00724CountryCode.length);
   	
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724CountryCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724CountryCode with another Field
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source) {
       replace(source,0,source.length(),beginIp00724CountryCode,IP_00724_COUNTRY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724CountryCode,IP_00724_COUNTRY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724CountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724CountryCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724CountryIso
	 *	@return ip00724CountryIso
	 */
	public int getIp00724CountryIso() throws CFException {
       if (isIp00724CountryIsoModified()) { 
           ip00724CountryIso = refreshIp00724CountryIso();
        }
   		return ip00724CountryIso;
	}
	

	
	   
	/**
	 * 	Update Ip00724CountryIso with the passed value
	 *  Corresponding COBOL Variable is IP00724-COUNTRY-ISO
	 *	@param number
	 */
	public void setIp00724CountryIso(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724CountryIso = checkIp00724CountryIsoMaxLimit(number); 
		serializeIp00724CountryIso(ip00724CountryIso);
	}
	

	public void setIp00724CountryIso(long number) {
	    number = checkIp00724CountryIsoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00724CountryIso((int)number);
	}
	
	/**
	 * 	Update Ip00724CountryIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724CountryIso(char[] value) throws CFException {
		 ip00724CountryIso = serializeIp00724CountryIso(value);
	}
	/**
	 * 	Update Ip00724CountryIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724CountryIsoString(char[] value) throws CFException {
		 setIp00724CountryIso(value);
	}
	/**
	 *	Returns the value of ip00724ChbConvExclId
	 *	@return ip00724ChbConvExclId
	 */
   public char[] getIp00724ChbConvExclId() throws CFException{
     if (isIp00724ChbConvExclIdModified()) { 
        ip00724ChbConvExclId = refreshIp00724ChbConvExclId();
     }
   		return ip00724ChbConvExclId;
   }

  
	/**
	*  set variable ip00724ChbConvExclId
	*  Corresponding COBOL Variable is IP00724-CHB-CONV-EXCL-ID
	*  @param value
	**/
   public void setIp00724ChbConvExclId(char[] value) {
      ip00724ChbConvExclId = checkIp00724ChbConvExclIdConstraints(value);
      serializeIp00724ChbConvExclId(ip00724ChbConvExclId);
   } 

     /**
	 * 	Update Ip00724ChbConvExclId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724ChbConvExclId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724ChbConvExclId,ip00724ChbConvExclId.length);
   	
   }
   
   public void setIp00724ChbConvExclId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbConvExclId,ip00724ChbConvExclId.length);
   	
   }
   
     /**
	 * 	Update Ip00724ChbConvExclId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ChbConvExclId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbConvExclId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724ChbConvExclId with another Field
	 *	@param value
	 */
   public void setIp00724ChbConvExclId(Field source) {
       replace(source,0,source.length(),beginIp00724ChbConvExclId,IP_00724_CHB_CONV_EXCL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724ChbConvExclId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724ChbConvExclId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724ChbConvExclId,IP_00724_CHB_CONV_EXCL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724ChbConvExclId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ChbConvExclId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbConvExclId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724ChbConvExprDt
	 *	@return ip00724ChbConvExprDt
	 */
	public long getIp00724ChbConvExprDt() throws CFException {
       if (isIp00724ChbConvExprDtModified()) { 
           ip00724ChbConvExprDt = refreshIp00724ChbConvExprDt();
        }
   		return ip00724ChbConvExprDt;
	}
	

	
	   
	/**
	 * 	Update Ip00724ChbConvExprDt with the passed value
	 *  Corresponding COBOL Variable is IP00724-CHB-CONV-EXPR-DT
	 *	@param number
	 */
	public void setIp00724ChbConvExprDt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724ChbConvExprDt = checkIp00724ChbConvExprDtMaxLimit(number); 
		serializeIp00724ChbConvExprDt(ip00724ChbConvExprDt);
	}
	

	/**
	 * 	Update Ip00724ChbConvExprDt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724ChbConvExprDt(char[] value) throws CFException {
		 ip00724ChbConvExprDt = serializeIp00724ChbConvExprDt(value);
	}
	/**
	 * 	Update Ip00724ChbConvExprDt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724ChbConvExprDtString(char[] value) throws CFException {
		 setIp00724ChbConvExprDt(value);
	}
	/**
	 *	Returns the value of ip00724ChbEditExcl
	 *	@return ip00724ChbEditExcl
	 */
   public char[] getIp00724ChbEditExcl() throws CFException{
     if (isIp00724ChbEditExclModified()) { 
        ip00724ChbEditExcl = refreshIp00724ChbEditExcl();
     }
   		return ip00724ChbEditExcl;
   }

  
	/**
	*  set variable ip00724ChbEditExcl
	*  Corresponding COBOL Variable is IP00724-CHB-EDIT-EXCL
	*  @param value
	**/
   public void setIp00724ChbEditExcl(char[] value) {
      ip00724ChbEditExcl = checkIp00724ChbEditExclConstraints(value);
      serializeIp00724ChbEditExcl(ip00724ChbEditExcl);
   } 

     /**
	 * 	Update Ip00724ChbEditExcl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724ChbEditExcl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724ChbEditExcl,ip00724ChbEditExcl.length);
   	
   }
   
   public void setIp00724ChbEditExcl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbEditExcl,ip00724ChbEditExcl.length);
   	
   }
   
     /**
	 * 	Update Ip00724ChbEditExcl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ChbEditExcl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbEditExcl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724ChbEditExcl with another Field
	 *	@param value
	 */
   public void setIp00724ChbEditExcl(Field source) {
       replace(source,0,source.length(),beginIp00724ChbEditExcl,IP_00724_CHB_EDIT_EXCL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724ChbEditExcl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724ChbEditExcl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724ChbEditExcl,IP_00724_CHB_EDIT_EXCL_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724ChbEditExcl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724ChbEditExcl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724ChbEditExcl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724HardshipEffectInd
	 *	@return ip00724HardshipEffectInd
	 */
   public char[] getIp00724HardshipEffectInd() throws CFException{
     if (isIp00724HardshipEffectIndModified()) { 
        ip00724HardshipEffectInd = refreshIp00724HardshipEffectInd();
     }
   		return ip00724HardshipEffectInd;
   }

  
	/**
	*  set variable ip00724HardshipEffectInd
	*  Corresponding COBOL Variable is IP00724-HARDSHIP-EFFECT-IND
	*  @param value
	**/
   public void setIp00724HardshipEffectInd(char[] value) {
      ip00724HardshipEffectInd = checkIp00724HardshipEffectIndConstraints(value);
      serializeIp00724HardshipEffectInd(ip00724HardshipEffectInd);
   } 

     /**
	 * 	Update Ip00724HardshipEffectInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724HardshipEffectInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724HardshipEffectInd,ip00724HardshipEffectInd.length);
   	
   }
   
   public void setIp00724HardshipEffectInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724HardshipEffectInd,ip00724HardshipEffectInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724HardshipEffectInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724HardshipEffectInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724HardshipEffectInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724HardshipEffectInd with another Field
	 *	@param value
	 */
   public void setIp00724HardshipEffectInd(Field source) {
       replace(source,0,source.length(),beginIp00724HardshipEffectInd,IP_00724_HARDSHIP_EFFECT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724HardshipEffectInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724HardshipEffectInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724HardshipEffectInd,IP_00724_HARDSHIP_EFFECT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724HardshipEffectInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724HardshipEffectInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724HardshipEffectInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724HardshipEffectDate
	 *	@return ip00724HardshipEffectDate
	 */
	public long getIp00724HardshipEffectDate() throws CFException {
       if (isIp00724HardshipEffectDateModified()) { 
           ip00724HardshipEffectDate = refreshIp00724HardshipEffectDate();
        }
   		return ip00724HardshipEffectDate;
	}
	

	
	   
	/**
	 * 	Update Ip00724HardshipEffectDate with the passed value
	 *  Corresponding COBOL Variable is IP00724-HARDSHIP-EFFECT-DATE
	 *	@param number
	 */
	public void setIp00724HardshipEffectDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724HardshipEffectDate = checkIp00724HardshipEffectDateMaxLimit(number); 
		serializeIp00724HardshipEffectDate(ip00724HardshipEffectDate);
	}
	

	/**
	 * 	Update Ip00724HardshipEffectDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724HardshipEffectDate(char[] value) throws CFException {
		 ip00724HardshipEffectDate = serializeIp00724HardshipEffectDate(value);
	}
	/**
	 * 	Update Ip00724HardshipEffectDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724HardshipEffectDateString(char[] value) throws CFException {
		 setIp00724HardshipEffectDate(value);
	}
	/**
	 *	Returns the value of ip00724HardshipExpireDate
	 *	@return ip00724HardshipExpireDate
	 */
	public long getIp00724HardshipExpireDate() throws CFException {
       if (isIp00724HardshipExpireDateModified()) { 
           ip00724HardshipExpireDate = refreshIp00724HardshipExpireDate();
        }
   		return ip00724HardshipExpireDate;
	}
	

	
	   
	/**
	 * 	Update Ip00724HardshipExpireDate with the passed value
	 *  Corresponding COBOL Variable is IP00724-HARDSHIP-EXPIRE-DATE
	 *	@param number
	 */
	public void setIp00724HardshipExpireDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00724HardshipExpireDate = checkIp00724HardshipExpireDateMaxLimit(number); 
		serializeIp00724HardshipExpireDate(ip00724HardshipExpireDate);
	}
	

	/**
	 * 	Update Ip00724HardshipExpireDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00724HardshipExpireDate(char[] value) throws CFException {
		 ip00724HardshipExpireDate = serializeIp00724HardshipExpireDate(value);
	}
	/**
	 * 	Update Ip00724HardshipExpireDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00724HardshipExpireDateString(char[] value) throws CFException {
		 setIp00724HardshipExpireDate(value);
	}
	/**
	 *	Returns the value of ip00724FormatIndicator
	 *	@return ip00724FormatIndicator
	 */
   public char[] getIp00724FormatIndicator() throws CFException{
     if (isIp00724FormatIndicatorModified()) { 
        ip00724FormatIndicator = refreshIp00724FormatIndicator();
     }
   		return ip00724FormatIndicator;
   }

  
	/**
	*  set variable ip00724FormatIndicator
	*  Corresponding COBOL Variable is IP00724-FORMAT-INDICATOR
	*  @param value
	**/
   public void setIp00724FormatIndicator(char[] value) {
      ip00724FormatIndicator = checkIp00724FormatIndicatorConstraints(value);
      serializeIp00724FormatIndicator(ip00724FormatIndicator);
   } 

     /**
	 * 	Update Ip00724FormatIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724FormatIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724FormatIndicator,ip00724FormatIndicator.length);
   	
   }
   
   public void setIp00724FormatIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724FormatIndicator,ip00724FormatIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip00724FormatIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724FormatIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724FormatIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724FormatIndicator with another Field
	 *	@param value
	 */
   public void setIp00724FormatIndicator(Field source) {
       replace(source,0,source.length(),beginIp00724FormatIndicator,IP_00724_FORMAT_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724FormatIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724FormatIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724FormatIndicator,IP_00724_FORMAT_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724FormatIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724FormatIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724FormatIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724McePartcptnCd
	 *	@return ip00724McePartcptnCd
	 */
   public char[] getIp00724McePartcptnCd() throws CFException{
     if (isIp00724McePartcptnCdModified()) { 
        ip00724McePartcptnCd = refreshIp00724McePartcptnCd();
     }
   		return ip00724McePartcptnCd;
   }

  
	/**
	*  set variable ip00724McePartcptnCd
	*  Corresponding COBOL Variable is IP00724-MCE-PARTCPTN-CD
	*  @param value
	**/
   public void setIp00724McePartcptnCd(char[] value) {
      ip00724McePartcptnCd = checkIp00724McePartcptnCdConstraints(value);
      serializeIp00724McePartcptnCd(ip00724McePartcptnCd);
   } 

     /**
	 * 	Update Ip00724McePartcptnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724McePartcptnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724McePartcptnCd,ip00724McePartcptnCd.length);
   	
   }
   
   public void setIp00724McePartcptnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McePartcptnCd,ip00724McePartcptnCd.length);
   	
   }
   
     /**
	 * 	Update Ip00724McePartcptnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724McePartcptnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McePartcptnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724McePartcptnCd with another Field
	 *	@param value
	 */
   public void setIp00724McePartcptnCd(Field source) {
       replace(source,0,source.length(),beginIp00724McePartcptnCd,IP_00724_MCE_PARTCPTN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724McePartcptnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724McePartcptnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724McePartcptnCd,IP_00724_MCE_PARTCPTN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724McePartcptnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724McePartcptnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724McePartcptnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724EeaAcqCtrySrvIca
	 *	@return ip00724EeaAcqCtrySrvIca
	 */
   public char[] getIp00724EeaAcqCtrySrvIca() throws CFException{
     if (isIp00724EeaAcqCtrySrvIcaModified()) { 
        ip00724EeaAcqCtrySrvIca = refreshIp00724EeaAcqCtrySrvIca();
     }
   		return ip00724EeaAcqCtrySrvIca;
   }

  
	/**
	*  set variable ip00724EeaAcqCtrySrvIca
	*  Corresponding COBOL Variable is IP00724-EEA-ACQ-CTRY-SRV-ICA
	*  @param value
	**/
   public void setIp00724EeaAcqCtrySrvIca(char[] value) {
      ip00724EeaAcqCtrySrvIca = checkIp00724EeaAcqCtrySrvIcaConstraints(value);
      serializeIp00724EeaAcqCtrySrvIca(ip00724EeaAcqCtrySrvIca);
   } 

     /**
	 * 	Update Ip00724EeaAcqCtrySrvIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724EeaAcqCtrySrvIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724EeaAcqCtrySrvIca,ip00724EeaAcqCtrySrvIca.length);
   	
   }
   
   public void setIp00724EeaAcqCtrySrvIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EeaAcqCtrySrvIca,ip00724EeaAcqCtrySrvIca.length);
   	
   }
   
     /**
	 * 	Update Ip00724EeaAcqCtrySrvIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724EeaAcqCtrySrvIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EeaAcqCtrySrvIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724EeaAcqCtrySrvIca with another Field
	 *	@param value
	 */
   public void setIp00724EeaAcqCtrySrvIca(Field source) {
       replace(source,0,source.length(),beginIp00724EeaAcqCtrySrvIca,IP_00724_EEA_ACQ_CTRY_SRV_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724EeaAcqCtrySrvIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724EeaAcqCtrySrvIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724EeaAcqCtrySrvIca,IP_00724_EEA_ACQ_CTRY_SRV_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724EeaAcqCtrySrvIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724EeaAcqCtrySrvIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EeaAcqCtrySrvIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724IrdDeterminePart
	 *	@return ip00724IrdDeterminePart
	 */
   public char[] getIp00724IrdDeterminePart() throws CFException{
     if (isIp00724IrdDeterminePartModified()) { 
        ip00724IrdDeterminePart = refreshIp00724IrdDeterminePart();
     }
   		return ip00724IrdDeterminePart;
   }

  
	/**
	*  set variable ip00724IrdDeterminePart
	*  Corresponding COBOL Variable is IP00724-IRD-DETERMINE-PART
	*  @param value
	**/
   public void setIp00724IrdDeterminePart(char[] value) {
      ip00724IrdDeterminePart = checkIp00724IrdDeterminePartConstraints(value);
      serializeIp00724IrdDeterminePart(ip00724IrdDeterminePart);
   } 

     /**
	 * 	Update Ip00724IrdDeterminePart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IrdDeterminePart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IrdDeterminePart,ip00724IrdDeterminePart.length);
   	
   }
   
   public void setIp00724IrdDeterminePart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IrdDeterminePart,ip00724IrdDeterminePart.length);
   	
   }
   
     /**
	 * 	Update Ip00724IrdDeterminePart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IrdDeterminePart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IrdDeterminePart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IrdDeterminePart with another Field
	 *	@param value
	 */
   public void setIp00724IrdDeterminePart(Field source) {
       replace(source,0,source.length(),beginIp00724IrdDeterminePart,IP_00724_IRD_DETERMINE_PART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IrdDeterminePart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IrdDeterminePart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IrdDeterminePart,IP_00724_IRD_DETERMINE_PART_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IrdDeterminePart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IrdDeterminePart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IrdDeterminePart+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724NpgAcqProcInd
	 *	@return ip00724NpgAcqProcInd
	 */
   public char[] getIp00724NpgAcqProcInd() throws CFException{
     if (isIp00724NpgAcqProcIndModified()) { 
        ip00724NpgAcqProcInd = refreshIp00724NpgAcqProcInd();
     }
   		return ip00724NpgAcqProcInd;
   }

  
	/**
	*  set variable ip00724NpgAcqProcInd
	*  Corresponding COBOL Variable is IP00724-NPG-ACQ-PROC-IND
	*  @param value
	**/
   public void setIp00724NpgAcqProcInd(char[] value) {
      ip00724NpgAcqProcInd = checkIp00724NpgAcqProcIndConstraints(value);
      serializeIp00724NpgAcqProcInd(ip00724NpgAcqProcInd);
   } 

     /**
	 * 	Update Ip00724NpgAcqProcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724NpgAcqProcInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724NpgAcqProcInd,ip00724NpgAcqProcInd.length);
   	
   }
   
   public void setIp00724NpgAcqProcInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NpgAcqProcInd,ip00724NpgAcqProcInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724NpgAcqProcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NpgAcqProcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NpgAcqProcInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724NpgAcqProcInd with another Field
	 *	@param value
	 */
   public void setIp00724NpgAcqProcInd(Field source) {
       replace(source,0,source.length(),beginIp00724NpgAcqProcInd,IP_00724_NPG_ACQ_PROC_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724NpgAcqProcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724NpgAcqProcInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724NpgAcqProcInd,IP_00724_NPG_ACQ_PROC_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724NpgAcqProcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724NpgAcqProcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724NpgAcqProcInd+targetIndex,targetLen);
    
   }
	char[] ip00724NpgAcqProcIndY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724NpgAcqProcIndY88()
	 *	@return  Returns true if isIp00724NpgAcqProcIndY88() is "Y"
	 */
   public boolean isIp00724NpgAcqProcIndY88() throws CFException {
      return (  compareChars( getIp00724NpgAcqProcInd() , ip00724NpgAcqProcIndY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724NpgAcqProcIndY88True() {  			
    	setIp00724NpgAcqProcInd( ip00724NpgAcqProcIndY8888Value);
   	}
	/**
	 *	Returns the value of ip00724PtaParticipantInd
	 *	@return ip00724PtaParticipantInd
	 */
   public char[] getIp00724PtaParticipantInd() throws CFException{
     if (isIp00724PtaParticipantIndModified()) { 
        ip00724PtaParticipantInd = refreshIp00724PtaParticipantInd();
     }
   		return ip00724PtaParticipantInd;
   }

  
	/**
	*  set variable ip00724PtaParticipantInd
	*  Corresponding COBOL Variable is IP00724-PTA-PARTICIPANT-IND
	*  @param value
	**/
   public void setIp00724PtaParticipantInd(char[] value) {
      ip00724PtaParticipantInd = checkIp00724PtaParticipantIndConstraints(value);
      serializeIp00724PtaParticipantInd(ip00724PtaParticipantInd);
   } 

     /**
	 * 	Update Ip00724PtaParticipantInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724PtaParticipantInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724PtaParticipantInd,ip00724PtaParticipantInd.length);
   	
   }
   
   public void setIp00724PtaParticipantInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724PtaParticipantInd,ip00724PtaParticipantInd.length);
   	
   }
   
     /**
	 * 	Update Ip00724PtaParticipantInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724PtaParticipantInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724PtaParticipantInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724PtaParticipantInd with another Field
	 *	@param value
	 */
   public void setIp00724PtaParticipantInd(Field source) {
       replace(source,0,source.length(),beginIp00724PtaParticipantInd,IP_00724_PTA_PARTICIPANT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724PtaParticipantInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724PtaParticipantInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724PtaParticipantInd,IP_00724_PTA_PARTICIPANT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724PtaParticipantInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724PtaParticipantInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724PtaParticipantInd+targetIndex,targetLen);
    
   }
	char[] ip00724PtaParticipantY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724PtaParticipantY88()
	 *	@return  Returns true if isIp00724PtaParticipantY88() is "Y"
	 */
   public boolean isIp00724PtaParticipantY88() throws CFException {
      return (  compareChars( getIp00724PtaParticipantInd() , ip00724PtaParticipantY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724PtaParticipantY88True() {  			
    	setIp00724PtaParticipantInd( ip00724PtaParticipantY8888Value);
   	}
	/**
	 *	Returns the value of ip00724MemberFiller
	 *	@return ip00724MemberFiller
	 */
   public char[] getIp00724MemberFiller() throws CFException{
     if (isIp00724MemberFillerModified()) { 
        ip00724MemberFiller = refreshIp00724MemberFiller();
     }
   		return ip00724MemberFiller;
   }

  
	/**
	*  set variable ip00724MemberFiller
	*  Corresponding COBOL Variable is IP00724-MEMBER-FILLER
	*  @param value
	**/
   public void setIp00724MemberFiller(char[] value) {
      ip00724MemberFiller = checkIp00724MemberFillerConstraints(value);
      serializeIp00724MemberFiller(ip00724MemberFiller);
   } 

     /**
	 * 	Update Ip00724MemberFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724MemberFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724MemberFiller,ip00724MemberFiller.length);
   	
   }
   
   public void setIp00724MemberFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberFiller,ip00724MemberFiller.length);
   	
   }
   
     /**
	 * 	Update Ip00724MemberFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724MemberFiller with another Field
	 *	@param value
	 */
   public void setIp00724MemberFiller(Field source) {
       replace(source,0,source.length(),beginIp00724MemberFiller,IP_00724_MEMBER_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724MemberFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724MemberFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724MemberFiller,IP_00724_MEMBER_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724MemberFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724MemberFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724MemberFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00724CentralSiteFields
	 *	@return ip00724CentralSiteFields
	 */   
	 public Ip00724CentralSiteFields getIp00724CentralSiteFields() {
   	return ip00724CentralSiteFields;
   }
   /**
	* 	Update Ip00724CentralSiteFields with the passed value
	*   Corresponding COBOL Variable is IP00724-CENTRAL-SITE-FIELDS
	*	@param value
	*/
   public void setIp00724CentralSiteFields(char[] value) {
      ip00724CentralSiteFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip00724CentralSiteFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00724CentralSiteFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724CentralSiteFields.begin,ip00724CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00724CentralSiteFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CentralSiteFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724CentralSiteFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00724CentralSiteFields with another Field
	 *	@param value
	 */
   public void setIp00724CentralSiteFields(Field source) {
   	replace(source,0,source.length(),ip00724CentralSiteFields.begin,ip00724CentralSiteFields.length());
   }  
   
     /**
	 * 	Update Ip00724CentralSiteFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00724CentralSiteFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00724CentralSiteFields.begin,ip00724CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip00724CentralSiteFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724CentralSiteFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00724CentralSiteFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00724TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00724Key.initialize();
     
         setIp00724Filler3(CONSTANTS.SPACE);
         setIp00724Filler4(CONSTANTS.SPACE);
         setIp00724IchgReg(CONSTANTS.SPACE);
         setIp00724ElectronicQualifier(CONSTANTS.SPACE_2);
         setIp00724IntUseIca(CONSTANTS.SPACE);
         setIp00724AcqSw(CONSTANTS.SPACE);
         setIp00724AtmInd(CONSTANTS.SPACE);
         setIp00724RclRegion(CONSTANTS.SPACE);
                     setIp00724Endpoint(0);
         setIp00724WorldIcaChbSw(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw1(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw2(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw3(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw4(CONSTANTS.SPACE);
         setIp00724WorldGrpChbSw5(CONSTANTS.SPACE);
         setIp00724Filler5(CONSTANTS.SPACE);
         setIp00724MemberName(CONSTANTS.SPACE_30);
         setIp00724CountryCode(CONSTANTS.SPACE_3);
                     setIp00724CountryIso(0);
         setIp00724ChbConvExclId(CONSTANTS.SPACE);
                     setIp00724ChbConvExprDt(0);
         setIp00724ChbEditExcl(CONSTANTS.SPACE);
         setIp00724HardshipEffectInd(CONSTANTS.SPACE);
                     setIp00724HardshipEffectDate(0);
                     setIp00724HardshipExpireDate(0);
         setIp00724FormatIndicator(CONSTANTS.SPACE);
         setIp00724McePartcptnCd(CONSTANTS.SPACE);
         setIp00724EeaAcqCtrySrvIca(CONSTANTS.SPACE);
         setIp00724IrdDeterminePart(CONSTANTS.SPACE);
         setIp00724NpgAcqProcInd(CONSTANTS.SPACE);
         setIp00724PtaParticipantInd(CONSTANTS.SPACE);
         setIp00724MemberFiller(CONSTANTS.SPACE_8);
          ip00724CentralSiteFields.initialize();
     
   }

		public static int getIp00724TableEntryFieldLength() {
			return IP_00724_TABLE_ENTRY_LENGTH;
		}

}
  
