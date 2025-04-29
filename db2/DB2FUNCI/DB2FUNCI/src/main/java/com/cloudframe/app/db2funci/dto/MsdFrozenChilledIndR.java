package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdFrozenChilledIndR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdFrozenChilledIndR extends MsdFrozenChilledIndRSerialized { 
   

						private char[] msdFcInd1 = Field.fillLowValue(1);

						private char[] msdFcInd2 = Field.fillLowValue(1);

						private char[] msdFcInd3 = Field.fillLowValue(1);

						private char[] msdFcInd4 = Field.fillLowValue(1);

						private char[] msdFcInd5 = Field.fillLowValue(1);

						private char[] msdFcInd6 = Field.fillLowValue(1);

						private char[] msdFcInd7 = Field.fillLowValue(1);

						private char[] msdFcInd8 = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdFrozenChilledIndR
	**/
    public MsdFrozenChilledIndR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdFrozenChilledIndR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFrozenChilledIndR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdFcInd1
	 *	@return msdFcInd1
	 */
   public char[] getMsdFcInd1() throws CFException{
     if (isMsdFcInd1Modified()) { 
        msdFcInd1 = refreshMsdFcInd1();
     }
   		return msdFcInd1;
   }

  
	/**
	*  set variable msdFcInd1
	*  Corresponding COBOL Variable is MSD-FC-IND-1
	*  @param value
	**/
   public void setMsdFcInd1(char[] value) {
      msdFcInd1 = checkMsdFcInd1Constraints(value);
      serializeMsdFcInd1(msdFcInd1);
   } 

     /**
	 * 	Update MsdFcInd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd1,msdFcInd1.length);
   	
   }
   
   public void setMsdFcInd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd1,msdFcInd1.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd1 with another Field
	 *	@param value
	 */
   public void setMsdFcInd1(Field source) {
       replace(source,0,source.length(),beginMsdFcInd1,MSD_FC_IND_1_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd1,MSD_FC_IND_1_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd1+targetIndex,targetLen);
    
   }
	char[] msdFedFundSameDay88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdFedFundSameDay()
	 *	@return  Returns true if isMsdFedFundSameDay() is "1"
	 */
   public boolean isMsdFedFundSameDay() throws CFException {
      return (  compareChars( getMsdFcInd1() , msdFedFundSameDay88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdFedFundSameDayTrue() {  			
    	setMsdFcInd1( msdFedFundSameDay88Value);
   	}
	/**
	 *	Returns the value of msdFcInd2
	 *	@return msdFcInd2
	 */
   public char[] getMsdFcInd2() throws CFException{
     if (isMsdFcInd2Modified()) { 
        msdFcInd2 = refreshMsdFcInd2();
     }
   		return msdFcInd2;
   }

  
	/**
	*  set variable msdFcInd2
	*  Corresponding COBOL Variable is MSD-FC-IND-2
	*  @param value
	**/
   public void setMsdFcInd2(char[] value) {
      msdFcInd2 = checkMsdFcInd2Constraints(value);
      serializeMsdFcInd2(msdFcInd2);
   } 

     /**
	 * 	Update MsdFcInd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd2,msdFcInd2.length);
   	
   }
   
   public void setMsdFcInd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd2,msdFcInd2.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd2 with another Field
	 *	@param value
	 */
   public void setMsdFcInd2(Field source) {
       replace(source,0,source.length(),beginMsdFcInd2,MSD_FC_IND_2_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd2,MSD_FC_IND_2_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd2+targetIndex,targetLen);
    
   }
	char[] msdDepositChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdDepositChill()
	 *	@return  Returns true if isMsdDepositChill() is "1"
	 */
   public boolean isMsdDepositChill() throws CFException {
      return (  compareChars( getMsdFcInd2() , msdDepositChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdDepositChillTrue() {  			
    	setMsdFcInd2( msdDepositChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd3
	 *	@return msdFcInd3
	 */
   public char[] getMsdFcInd3() throws CFException{
     if (isMsdFcInd3Modified()) { 
        msdFcInd3 = refreshMsdFcInd3();
     }
   		return msdFcInd3;
   }

  
	/**
	*  set variable msdFcInd3
	*  Corresponding COBOL Variable is MSD-FC-IND-3
	*  @param value
	**/
   public void setMsdFcInd3(char[] value) {
      msdFcInd3 = checkMsdFcInd3Constraints(value);
      serializeMsdFcInd3(msdFcInd3);
   } 

     /**
	 * 	Update MsdFcInd3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd3,msdFcInd3.length);
   	
   }
   
   public void setMsdFcInd3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd3,msdFcInd3.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd3 with another Field
	 *	@param value
	 */
   public void setMsdFcInd3(Field source) {
       replace(source,0,source.length(),beginMsdFcInd3,MSD_FC_IND_3_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd3,MSD_FC_IND_3_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd3+targetIndex,targetLen);
    
   }
	char[] msdCodChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdCodChill()
	 *	@return  Returns true if isMsdCodChill() is "1"
	 */
   public boolean isMsdCodChill() throws CFException {
      return (  compareChars( getMsdFcInd3() , msdCodChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdCodChillTrue() {  			
    	setMsdFcInd3( msdCodChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd4
	 *	@return msdFcInd4
	 */
   public char[] getMsdFcInd4() throws CFException{
     if (isMsdFcInd4Modified()) { 
        msdFcInd4 = refreshMsdFcInd4();
     }
   		return msdFcInd4;
   }

  
	/**
	*  set variable msdFcInd4
	*  Corresponding COBOL Variable is MSD-FC-IND-4
	*  @param value
	**/
   public void setMsdFcInd4(char[] value) {
      msdFcInd4 = checkMsdFcInd4Constraints(value);
      serializeMsdFcInd4(msdFcInd4);
   } 

     /**
	 * 	Update MsdFcInd4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd4,msdFcInd4.length);
   	
   }
   
   public void setMsdFcInd4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd4,msdFcInd4.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd4 with another Field
	 *	@param value
	 */
   public void setMsdFcInd4(Field source) {
       replace(source,0,source.length(),beginMsdFcInd4,MSD_FC_IND_4_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd4,MSD_FC_IND_4_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd4+targetIndex,targetLen);
    
   }
	char[] msdWithdrawXrefChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdWithdrawXrefChill()
	 *	@return  Returns true if isMsdWithdrawXrefChill() is "1"
	 */
   public boolean isMsdWithdrawXrefChill() throws CFException {
      return (  compareChars( getMsdFcInd4() , msdWithdrawXrefChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdWithdrawXrefChillTrue() {  			
    	setMsdFcInd4( msdWithdrawXrefChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd5
	 *	@return msdFcInd5
	 */
   public char[] getMsdFcInd5() throws CFException{
     if (isMsdFcInd5Modified()) { 
        msdFcInd5 = refreshMsdFcInd5();
     }
   		return msdFcInd5;
   }

  
	/**
	*  set variable msdFcInd5
	*  Corresponding COBOL Variable is MSD-FC-IND-5
	*  @param value
	**/
   public void setMsdFcInd5(char[] value) {
      msdFcInd5 = checkMsdFcInd5Constraints(value);
      serializeMsdFcInd5(msdFcInd5);
   } 

     /**
	 * 	Update MsdFcInd5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd5,msdFcInd5.length);
   	
   }
   
   public void setMsdFcInd5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd5,msdFcInd5.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd5 with another Field
	 *	@param value
	 */
   public void setMsdFcInd5(Field source) {
       replace(source,0,source.length(),beginMsdFcInd5,MSD_FC_IND_5_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd5,MSD_FC_IND_5_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd5+targetIndex,targetLen);
    
   }
	char[] msdDelivOrderChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdDelivOrderChill()
	 *	@return  Returns true if isMsdDelivOrderChill() is "1"
	 */
   public boolean isMsdDelivOrderChill() throws CFException {
      return (  compareChars( getMsdFcInd5() , msdDelivOrderChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdDelivOrderChillTrue() {  			
    	setMsdFcInd5( msdDelivOrderChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd6
	 *	@return msdFcInd6
	 */
   public char[] getMsdFcInd6() throws CFException{
     if (isMsdFcInd6Modified()) { 
        msdFcInd6 = refreshMsdFcInd6();
     }
   		return msdFcInd6;
   }

  
	/**
	*  set variable msdFcInd6
	*  Corresponding COBOL Variable is MSD-FC-IND-6
	*  @param value
	**/
   public void setMsdFcInd6(char[] value) {
      msdFcInd6 = checkMsdFcInd6Constraints(value);
      serializeMsdFcInd6(msdFcInd6);
   } 

     /**
	 * 	Update MsdFcInd6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd6,msdFcInd6.length);
   	
   }
   
   public void setMsdFcInd6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd6,msdFcInd6.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd6 with another Field
	 *	@param value
	 */
   public void setMsdFcInd6(Field source) {
       replace(source,0,source.length(),beginMsdFcInd6,MSD_FC_IND_6_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd6,MSD_FC_IND_6_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd6+targetIndex,targetLen);
    
   }
	char[] msdPledgeChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdPledgeChill()
	 *	@return  Returns true if isMsdPledgeChill() is "1"
	 */
   public boolean isMsdPledgeChill() throws CFException {
      return (  compareChars( getMsdFcInd6() , msdPledgeChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdPledgeChillTrue() {  			
    	setMsdFcInd6( msdPledgeChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd7
	 *	@return msdFcInd7
	 */
   public char[] getMsdFcInd7() throws CFException{
     if (isMsdFcInd7Modified()) { 
        msdFcInd7 = refreshMsdFcInd7();
     }
   		return msdFcInd7;
   }

  
	/**
	*  set variable msdFcInd7
	*  Corresponding COBOL Variable is MSD-FC-IND-7
	*  @param value
	**/
   public void setMsdFcInd7(char[] value) {
      msdFcInd7 = checkMsdFcInd7Constraints(value);
      serializeMsdFcInd7(msdFcInd7);
   } 

     /**
	 * 	Update MsdFcInd7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd7,msdFcInd7.length);
   	
   }
   
   public void setMsdFcInd7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd7,msdFcInd7.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd7 with another Field
	 *	@param value
	 */
   public void setMsdFcInd7(Field source) {
       replace(source,0,source.length(),beginMsdFcInd7,MSD_FC_IND_7_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd7,MSD_FC_IND_7_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd7+targetIndex,targetLen);
    
   }
	char[] msdSegragationChill88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdSegragationChill()
	 *	@return  Returns true if isMsdSegragationChill() is "1"
	 */
   public boolean isMsdSegragationChill() throws CFException {
      return (  compareChars( getMsdFcInd7() , msdSegragationChill88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdSegragationChillTrue() {  			
    	setMsdFcInd7( msdSegragationChill88Value);
   	}
	/**
	 *	Returns the value of msdFcInd8
	 *	@return msdFcInd8
	 */
   public char[] getMsdFcInd8() throws CFException{
     if (isMsdFcInd8Modified()) { 
        msdFcInd8 = refreshMsdFcInd8();
     }
   		return msdFcInd8;
   }

  
	/**
	*  set variable msdFcInd8
	*  Corresponding COBOL Variable is MSD-FC-IND-8
	*  @param value
	**/
   public void setMsdFcInd8(char[] value) {
      msdFcInd8 = checkMsdFcInd8Constraints(value);
      serializeMsdFcInd8(msdFcInd8);
   } 

     /**
	 * 	Update MsdFcInd8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFcInd8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFcInd8,msdFcInd8.length);
   	
   }
   
   public void setMsdFcInd8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd8,msdFcInd8.length);
   	
   }
   
     /**
	 * 	Update MsdFcInd8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFcInd8 with another Field
	 *	@param value
	 */
   public void setMsdFcInd8(Field source) {
       replace(source,0,source.length(),beginMsdFcInd8,MSD_FC_IND_8_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFcInd8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFcInd8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFcInd8,MSD_FC_IND_8_LEN);
   	
   }
   
     /**
	 * 	Update MsdFcInd8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFcInd8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFcInd8+targetIndex,targetLen);
    
   }
	char[] msdFrozen88Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isMsdFrozen()
	 *	@return  Returns true if isMsdFrozen() is "1"
	 */
   public boolean isMsdFrozen() throws CFException {
      return (  compareChars( getMsdFcInd8() , msdFrozen88Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setMsdFrozenTrue() {  			
    	setMsdFcInd8( msdFrozen88Value);
   	}

	
	
	

		public static int getMsdFrozenChilledIndRFieldLength() {
			return MSD_FROZEN_CHILLED_IND_R_LENGTH;
		}

}
  
