package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup21 extends Ip65504PdsNamesLargeGroup21Serialized { 
   

								private short ip65504P621PurTimS;

								private short ip65504P621PurTimL;


								private short ip65504P622MtrSvcS;

								private short ip65504P622MtrSvcL;


								private short ip65504P623MtrfuelS;

								private short ip65504P623MtrfuelL;


								private short ip65504P624ReservdS;

								private short ip65504P624ReservdL;


								private short ip65504P625ReservdS;

								private short ip65504P625ReservdL;


								private short ip65504P626ReservdS;

								private short ip65504P626ReservdL;


								private short ip65504P627ReservdS;

								private short ip65504P627ReservdL;


								private short ip65504P628ReservdS;

								private short ip65504P628ReservdL;


								private short ip65504P629OdometrS;

								private short ip65504P629OdometrL;


								private short ip65504P630VehNbrS;

								private short ip65504P630VehNbrL;


								private short ip65504P631DrvrNoS;

								private short ip65504P631DrvrNoL;


								private short ip65504P632ProdCdS;

								private short ip65504P632ProdCdL;


								private short ip65504P633CoupamtS;

								private short ip65504P633CoupamtL;


								private short ip65504P634Taxamt1S;

								private short ip65504P634Taxamt1L;


								private short ip65504P635Taxamt2S;

								private short ip65504P635Taxamt2L;


								private short ip65504P636ReservdS;

								private short ip65504P636ReservdL;


								private short ip65504P637ReservdS;

								private short ip65504P637ReservdL;


								private short ip65504P638ReservdS;

								private short ip65504P638ReservdL;


								private short ip65504P639ReservdS;

								private short ip65504P639ReservdL;


								private short ip65504P640ReservdS;

								private short ip65504P640ReservdL;


								private short ip65504P641ProdCdS;

								private short ip65504P641ProdCdL;


								private short ip65504P642ItmDesS;

								private short ip65504P642ItmDesL;


								private short ip65504P643ItmQtyS;

								private short ip65504P643ItmQtyL;


								private short ip65504P644ReservdS;

								private short ip65504P644ReservdL;


								private short ip65504P645ItmUomS;

								private short ip65504P645ItmUomL;


								private short ip65504P646UnitprcS;

								private short ip65504P646UnitprcL;


								private short ip65504P647ExtAmtS;

								private short ip65504P647ExtAmtL;


								private short ip65504P648ItmdsctS;

								private short ip65504P648ItmdsctL;


								private short ip65504P649ReservdS;

								private short ip65504P649ReservdL;


								private short ip65504P650NetGrsS;

								private short ip65504P650NetGrsL;


								private short ip65504P651TaxRteS;

								private short ip65504P651TaxRteL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup21
	**/
    public Ip65504PdsNamesLargeGroup21() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup21. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup21(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P621PurTimS
	 *	@return ip65504P621PurTimS
	 */
	public short getIp65504P621PurTimS() throws CFException {
        if (isIp65504P621PurTimSModified()) { 
           ip65504P621PurTimS = refreshIp65504P621PurTimS();
        }
   		return ip65504P621PurTimS;
	}
	
	/**
	 * 	Update Ip65504P621PurTimS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P621-PUR-TIM-S
	 *	@param number
	 */
	public void setIp65504P621PurTimS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P621PurTimS = checkIp65504P621PurTimSMaxLimit(number); 
		serializeIp65504P621PurTimS(ip65504P621PurTimS);
	}

	public void setIp65504P621PurTimS(int number) {
	    number = checkIp65504P621PurTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P621PurTimS((short)number);
	}
	public void setIp65504P621PurTimS(long number) {
	    number = checkIp65504P621PurTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P621PurTimS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P621PurTimL
	 *	@return ip65504P621PurTimL
	 */
	public short getIp65504P621PurTimL() throws CFException {
        if (isIp65504P621PurTimLModified()) { 
           ip65504P621PurTimL = refreshIp65504P621PurTimL();
        }
   		return ip65504P621PurTimL;
	}
	
	/**
	 * 	Update Ip65504P621PurTimL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P621-PUR-TIM-L
	 *	@param number
	 */
	public void setIp65504P621PurTimL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P621PurTimL = checkIp65504P621PurTimLMaxLimit(number); 
		serializeIp65504P621PurTimL(ip65504P621PurTimL);
	}

	public void setIp65504P621PurTimL(int number) {
	    number = checkIp65504P621PurTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P621PurTimL((short)number);
	}
	public void setIp65504P621PurTimL(long number) {
	    number = checkIp65504P621PurTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P621PurTimL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P622MtrSvcS
	 *	@return ip65504P622MtrSvcS
	 */
	public short getIp65504P622MtrSvcS() throws CFException {
        if (isIp65504P622MtrSvcSModified()) { 
           ip65504P622MtrSvcS = refreshIp65504P622MtrSvcS();
        }
   		return ip65504P622MtrSvcS;
	}
	
	/**
	 * 	Update Ip65504P622MtrSvcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P622-MTR-SVC-S
	 *	@param number
	 */
	public void setIp65504P622MtrSvcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P622MtrSvcS = checkIp65504P622MtrSvcSMaxLimit(number); 
		serializeIp65504P622MtrSvcS(ip65504P622MtrSvcS);
	}

	public void setIp65504P622MtrSvcS(int number) {
	    number = checkIp65504P622MtrSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P622MtrSvcS((short)number);
	}
	public void setIp65504P622MtrSvcS(long number) {
	    number = checkIp65504P622MtrSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P622MtrSvcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P622MtrSvcL
	 *	@return ip65504P622MtrSvcL
	 */
	public short getIp65504P622MtrSvcL() throws CFException {
        if (isIp65504P622MtrSvcLModified()) { 
           ip65504P622MtrSvcL = refreshIp65504P622MtrSvcL();
        }
   		return ip65504P622MtrSvcL;
	}
	
	/**
	 * 	Update Ip65504P622MtrSvcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P622-MTR-SVC-L
	 *	@param number
	 */
	public void setIp65504P622MtrSvcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P622MtrSvcL = checkIp65504P622MtrSvcLMaxLimit(number); 
		serializeIp65504P622MtrSvcL(ip65504P622MtrSvcL);
	}

	public void setIp65504P622MtrSvcL(int number) {
	    number = checkIp65504P622MtrSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P622MtrSvcL((short)number);
	}
	public void setIp65504P622MtrSvcL(long number) {
	    number = checkIp65504P622MtrSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P622MtrSvcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P623MtrfuelS
	 *	@return ip65504P623MtrfuelS
	 */
	public short getIp65504P623MtrfuelS() throws CFException {
        if (isIp65504P623MtrfuelSModified()) { 
           ip65504P623MtrfuelS = refreshIp65504P623MtrfuelS();
        }
   		return ip65504P623MtrfuelS;
	}
	
	/**
	 * 	Update Ip65504P623MtrfuelS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P623-MTRFUEL-S
	 *	@param number
	 */
	public void setIp65504P623MtrfuelS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P623MtrfuelS = checkIp65504P623MtrfuelSMaxLimit(number); 
		serializeIp65504P623MtrfuelS(ip65504P623MtrfuelS);
	}

	public void setIp65504P623MtrfuelS(int number) {
	    number = checkIp65504P623MtrfuelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P623MtrfuelS((short)number);
	}
	public void setIp65504P623MtrfuelS(long number) {
	    number = checkIp65504P623MtrfuelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P623MtrfuelS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P623MtrfuelL
	 *	@return ip65504P623MtrfuelL
	 */
	public short getIp65504P623MtrfuelL() throws CFException {
        if (isIp65504P623MtrfuelLModified()) { 
           ip65504P623MtrfuelL = refreshIp65504P623MtrfuelL();
        }
   		return ip65504P623MtrfuelL;
	}
	
	/**
	 * 	Update Ip65504P623MtrfuelL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P623-MTRFUEL-L
	 *	@param number
	 */
	public void setIp65504P623MtrfuelL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P623MtrfuelL = checkIp65504P623MtrfuelLMaxLimit(number); 
		serializeIp65504P623MtrfuelL(ip65504P623MtrfuelL);
	}

	public void setIp65504P623MtrfuelL(int number) {
	    number = checkIp65504P623MtrfuelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P623MtrfuelL((short)number);
	}
	public void setIp65504P623MtrfuelL(long number) {
	    number = checkIp65504P623MtrfuelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P623MtrfuelL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P624ReservdS
	 *	@return ip65504P624ReservdS
	 */
	public short getIp65504P624ReservdS() throws CFException {
        if (isIp65504P624ReservdSModified()) { 
           ip65504P624ReservdS = refreshIp65504P624ReservdS();
        }
   		return ip65504P624ReservdS;
	}
	
	/**
	 * 	Update Ip65504P624ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P624-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P624ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P624ReservdS = checkIp65504P624ReservdSMaxLimit(number); 
		serializeIp65504P624ReservdS(ip65504P624ReservdS);
	}

	public void setIp65504P624ReservdS(int number) {
	    number = checkIp65504P624ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P624ReservdS((short)number);
	}
	public void setIp65504P624ReservdS(long number) {
	    number = checkIp65504P624ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P624ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P624ReservdL
	 *	@return ip65504P624ReservdL
	 */
	public short getIp65504P624ReservdL() throws CFException {
        if (isIp65504P624ReservdLModified()) { 
           ip65504P624ReservdL = refreshIp65504P624ReservdL();
        }
   		return ip65504P624ReservdL;
	}
	
	/**
	 * 	Update Ip65504P624ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P624-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P624ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P624ReservdL = checkIp65504P624ReservdLMaxLimit(number); 
		serializeIp65504P624ReservdL(ip65504P624ReservdL);
	}

	public void setIp65504P624ReservdL(int number) {
	    number = checkIp65504P624ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P624ReservdL((short)number);
	}
	public void setIp65504P624ReservdL(long number) {
	    number = checkIp65504P624ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P624ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P625ReservdS
	 *	@return ip65504P625ReservdS
	 */
	public short getIp65504P625ReservdS() throws CFException {
        if (isIp65504P625ReservdSModified()) { 
           ip65504P625ReservdS = refreshIp65504P625ReservdS();
        }
   		return ip65504P625ReservdS;
	}
	
	/**
	 * 	Update Ip65504P625ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P625-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P625ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P625ReservdS = checkIp65504P625ReservdSMaxLimit(number); 
		serializeIp65504P625ReservdS(ip65504P625ReservdS);
	}

	public void setIp65504P625ReservdS(int number) {
	    number = checkIp65504P625ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P625ReservdS((short)number);
	}
	public void setIp65504P625ReservdS(long number) {
	    number = checkIp65504P625ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P625ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P625ReservdL
	 *	@return ip65504P625ReservdL
	 */
	public short getIp65504P625ReservdL() throws CFException {
        if (isIp65504P625ReservdLModified()) { 
           ip65504P625ReservdL = refreshIp65504P625ReservdL();
        }
   		return ip65504P625ReservdL;
	}
	
	/**
	 * 	Update Ip65504P625ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P625-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P625ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P625ReservdL = checkIp65504P625ReservdLMaxLimit(number); 
		serializeIp65504P625ReservdL(ip65504P625ReservdL);
	}

	public void setIp65504P625ReservdL(int number) {
	    number = checkIp65504P625ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P625ReservdL((short)number);
	}
	public void setIp65504P625ReservdL(long number) {
	    number = checkIp65504P625ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P625ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P626ReservdS
	 *	@return ip65504P626ReservdS
	 */
	public short getIp65504P626ReservdS() throws CFException {
        if (isIp65504P626ReservdSModified()) { 
           ip65504P626ReservdS = refreshIp65504P626ReservdS();
        }
   		return ip65504P626ReservdS;
	}
	
	/**
	 * 	Update Ip65504P626ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P626-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P626ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P626ReservdS = checkIp65504P626ReservdSMaxLimit(number); 
		serializeIp65504P626ReservdS(ip65504P626ReservdS);
	}

	public void setIp65504P626ReservdS(int number) {
	    number = checkIp65504P626ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P626ReservdS((short)number);
	}
	public void setIp65504P626ReservdS(long number) {
	    number = checkIp65504P626ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P626ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P626ReservdL
	 *	@return ip65504P626ReservdL
	 */
	public short getIp65504P626ReservdL() throws CFException {
        if (isIp65504P626ReservdLModified()) { 
           ip65504P626ReservdL = refreshIp65504P626ReservdL();
        }
   		return ip65504P626ReservdL;
	}
	
	/**
	 * 	Update Ip65504P626ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P626-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P626ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P626ReservdL = checkIp65504P626ReservdLMaxLimit(number); 
		serializeIp65504P626ReservdL(ip65504P626ReservdL);
	}

	public void setIp65504P626ReservdL(int number) {
	    number = checkIp65504P626ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P626ReservdL((short)number);
	}
	public void setIp65504P626ReservdL(long number) {
	    number = checkIp65504P626ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P626ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P627ReservdS
	 *	@return ip65504P627ReservdS
	 */
	public short getIp65504P627ReservdS() throws CFException {
        if (isIp65504P627ReservdSModified()) { 
           ip65504P627ReservdS = refreshIp65504P627ReservdS();
        }
   		return ip65504P627ReservdS;
	}
	
	/**
	 * 	Update Ip65504P627ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P627-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P627ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P627ReservdS = checkIp65504P627ReservdSMaxLimit(number); 
		serializeIp65504P627ReservdS(ip65504P627ReservdS);
	}

	public void setIp65504P627ReservdS(int number) {
	    number = checkIp65504P627ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P627ReservdS((short)number);
	}
	public void setIp65504P627ReservdS(long number) {
	    number = checkIp65504P627ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P627ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P627ReservdL
	 *	@return ip65504P627ReservdL
	 */
	public short getIp65504P627ReservdL() throws CFException {
        if (isIp65504P627ReservdLModified()) { 
           ip65504P627ReservdL = refreshIp65504P627ReservdL();
        }
   		return ip65504P627ReservdL;
	}
	
	/**
	 * 	Update Ip65504P627ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P627-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P627ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P627ReservdL = checkIp65504P627ReservdLMaxLimit(number); 
		serializeIp65504P627ReservdL(ip65504P627ReservdL);
	}

	public void setIp65504P627ReservdL(int number) {
	    number = checkIp65504P627ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P627ReservdL((short)number);
	}
	public void setIp65504P627ReservdL(long number) {
	    number = checkIp65504P627ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P627ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P628ReservdS
	 *	@return ip65504P628ReservdS
	 */
	public short getIp65504P628ReservdS() throws CFException {
        if (isIp65504P628ReservdSModified()) { 
           ip65504P628ReservdS = refreshIp65504P628ReservdS();
        }
   		return ip65504P628ReservdS;
	}
	
	/**
	 * 	Update Ip65504P628ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P628-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P628ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P628ReservdS = checkIp65504P628ReservdSMaxLimit(number); 
		serializeIp65504P628ReservdS(ip65504P628ReservdS);
	}

	public void setIp65504P628ReservdS(int number) {
	    number = checkIp65504P628ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P628ReservdS((short)number);
	}
	public void setIp65504P628ReservdS(long number) {
	    number = checkIp65504P628ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P628ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P628ReservdL
	 *	@return ip65504P628ReservdL
	 */
	public short getIp65504P628ReservdL() throws CFException {
        if (isIp65504P628ReservdLModified()) { 
           ip65504P628ReservdL = refreshIp65504P628ReservdL();
        }
   		return ip65504P628ReservdL;
	}
	
	/**
	 * 	Update Ip65504P628ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P628-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P628ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P628ReservdL = checkIp65504P628ReservdLMaxLimit(number); 
		serializeIp65504P628ReservdL(ip65504P628ReservdL);
	}

	public void setIp65504P628ReservdL(int number) {
	    number = checkIp65504P628ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P628ReservdL((short)number);
	}
	public void setIp65504P628ReservdL(long number) {
	    number = checkIp65504P628ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P628ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P629OdometrS
	 *	@return ip65504P629OdometrS
	 */
	public short getIp65504P629OdometrS() throws CFException {
        if (isIp65504P629OdometrSModified()) { 
           ip65504P629OdometrS = refreshIp65504P629OdometrS();
        }
   		return ip65504P629OdometrS;
	}
	
	/**
	 * 	Update Ip65504P629OdometrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P629-ODOMETR-S
	 *	@param number
	 */
	public void setIp65504P629OdometrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P629OdometrS = checkIp65504P629OdometrSMaxLimit(number); 
		serializeIp65504P629OdometrS(ip65504P629OdometrS);
	}

	public void setIp65504P629OdometrS(int number) {
	    number = checkIp65504P629OdometrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P629OdometrS((short)number);
	}
	public void setIp65504P629OdometrS(long number) {
	    number = checkIp65504P629OdometrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P629OdometrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P629OdometrL
	 *	@return ip65504P629OdometrL
	 */
	public short getIp65504P629OdometrL() throws CFException {
        if (isIp65504P629OdometrLModified()) { 
           ip65504P629OdometrL = refreshIp65504P629OdometrL();
        }
   		return ip65504P629OdometrL;
	}
	
	/**
	 * 	Update Ip65504P629OdometrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P629-ODOMETR-L
	 *	@param number
	 */
	public void setIp65504P629OdometrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P629OdometrL = checkIp65504P629OdometrLMaxLimit(number); 
		serializeIp65504P629OdometrL(ip65504P629OdometrL);
	}

	public void setIp65504P629OdometrL(int number) {
	    number = checkIp65504P629OdometrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P629OdometrL((short)number);
	}
	public void setIp65504P629OdometrL(long number) {
	    number = checkIp65504P629OdometrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P629OdometrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P630VehNbrS
	 *	@return ip65504P630VehNbrS
	 */
	public short getIp65504P630VehNbrS() throws CFException {
        if (isIp65504P630VehNbrSModified()) { 
           ip65504P630VehNbrS = refreshIp65504P630VehNbrS();
        }
   		return ip65504P630VehNbrS;
	}
	
	/**
	 * 	Update Ip65504P630VehNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P630-VEH-NBR-S
	 *	@param number
	 */
	public void setIp65504P630VehNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P630VehNbrS = checkIp65504P630VehNbrSMaxLimit(number); 
		serializeIp65504P630VehNbrS(ip65504P630VehNbrS);
	}

	public void setIp65504P630VehNbrS(int number) {
	    number = checkIp65504P630VehNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P630VehNbrS((short)number);
	}
	public void setIp65504P630VehNbrS(long number) {
	    number = checkIp65504P630VehNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P630VehNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P630VehNbrL
	 *	@return ip65504P630VehNbrL
	 */
	public short getIp65504P630VehNbrL() throws CFException {
        if (isIp65504P630VehNbrLModified()) { 
           ip65504P630VehNbrL = refreshIp65504P630VehNbrL();
        }
   		return ip65504P630VehNbrL;
	}
	
	/**
	 * 	Update Ip65504P630VehNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P630-VEH-NBR-L
	 *	@param number
	 */
	public void setIp65504P630VehNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P630VehNbrL = checkIp65504P630VehNbrLMaxLimit(number); 
		serializeIp65504P630VehNbrL(ip65504P630VehNbrL);
	}

	public void setIp65504P630VehNbrL(int number) {
	    number = checkIp65504P630VehNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P630VehNbrL((short)number);
	}
	public void setIp65504P630VehNbrL(long number) {
	    number = checkIp65504P630VehNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P630VehNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P631DrvrNoS
	 *	@return ip65504P631DrvrNoS
	 */
	public short getIp65504P631DrvrNoS() throws CFException {
        if (isIp65504P631DrvrNoSModified()) { 
           ip65504P631DrvrNoS = refreshIp65504P631DrvrNoS();
        }
   		return ip65504P631DrvrNoS;
	}
	
	/**
	 * 	Update Ip65504P631DrvrNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P631-DRVR-NO-S
	 *	@param number
	 */
	public void setIp65504P631DrvrNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P631DrvrNoS = checkIp65504P631DrvrNoSMaxLimit(number); 
		serializeIp65504P631DrvrNoS(ip65504P631DrvrNoS);
	}

	public void setIp65504P631DrvrNoS(int number) {
	    number = checkIp65504P631DrvrNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P631DrvrNoS((short)number);
	}
	public void setIp65504P631DrvrNoS(long number) {
	    number = checkIp65504P631DrvrNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P631DrvrNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P631DrvrNoL
	 *	@return ip65504P631DrvrNoL
	 */
	public short getIp65504P631DrvrNoL() throws CFException {
        if (isIp65504P631DrvrNoLModified()) { 
           ip65504P631DrvrNoL = refreshIp65504P631DrvrNoL();
        }
   		return ip65504P631DrvrNoL;
	}
	
	/**
	 * 	Update Ip65504P631DrvrNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P631-DRVR-NO-L
	 *	@param number
	 */
	public void setIp65504P631DrvrNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P631DrvrNoL = checkIp65504P631DrvrNoLMaxLimit(number); 
		serializeIp65504P631DrvrNoL(ip65504P631DrvrNoL);
	}

	public void setIp65504P631DrvrNoL(int number) {
	    number = checkIp65504P631DrvrNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P631DrvrNoL((short)number);
	}
	public void setIp65504P631DrvrNoL(long number) {
	    number = checkIp65504P631DrvrNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P631DrvrNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P632ProdCdS
	 *	@return ip65504P632ProdCdS
	 */
	public short getIp65504P632ProdCdS() throws CFException {
        if (isIp65504P632ProdCdSModified()) { 
           ip65504P632ProdCdS = refreshIp65504P632ProdCdS();
        }
   		return ip65504P632ProdCdS;
	}
	
	/**
	 * 	Update Ip65504P632ProdCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P632-PROD-CD-S
	 *	@param number
	 */
	public void setIp65504P632ProdCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P632ProdCdS = checkIp65504P632ProdCdSMaxLimit(number); 
		serializeIp65504P632ProdCdS(ip65504P632ProdCdS);
	}

	public void setIp65504P632ProdCdS(int number) {
	    number = checkIp65504P632ProdCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P632ProdCdS((short)number);
	}
	public void setIp65504P632ProdCdS(long number) {
	    number = checkIp65504P632ProdCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P632ProdCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P632ProdCdL
	 *	@return ip65504P632ProdCdL
	 */
	public short getIp65504P632ProdCdL() throws CFException {
        if (isIp65504P632ProdCdLModified()) { 
           ip65504P632ProdCdL = refreshIp65504P632ProdCdL();
        }
   		return ip65504P632ProdCdL;
	}
	
	/**
	 * 	Update Ip65504P632ProdCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P632-PROD-CD-L
	 *	@param number
	 */
	public void setIp65504P632ProdCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P632ProdCdL = checkIp65504P632ProdCdLMaxLimit(number); 
		serializeIp65504P632ProdCdL(ip65504P632ProdCdL);
	}

	public void setIp65504P632ProdCdL(int number) {
	    number = checkIp65504P632ProdCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P632ProdCdL((short)number);
	}
	public void setIp65504P632ProdCdL(long number) {
	    number = checkIp65504P632ProdCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P632ProdCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P633CoupamtS
	 *	@return ip65504P633CoupamtS
	 */
	public short getIp65504P633CoupamtS() throws CFException {
        if (isIp65504P633CoupamtSModified()) { 
           ip65504P633CoupamtS = refreshIp65504P633CoupamtS();
        }
   		return ip65504P633CoupamtS;
	}
	
	/**
	 * 	Update Ip65504P633CoupamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P633-COUPAMT-S
	 *	@param number
	 */
	public void setIp65504P633CoupamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P633CoupamtS = checkIp65504P633CoupamtSMaxLimit(number); 
		serializeIp65504P633CoupamtS(ip65504P633CoupamtS);
	}

	public void setIp65504P633CoupamtS(int number) {
	    number = checkIp65504P633CoupamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P633CoupamtS((short)number);
	}
	public void setIp65504P633CoupamtS(long number) {
	    number = checkIp65504P633CoupamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P633CoupamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P633CoupamtL
	 *	@return ip65504P633CoupamtL
	 */
	public short getIp65504P633CoupamtL() throws CFException {
        if (isIp65504P633CoupamtLModified()) { 
           ip65504P633CoupamtL = refreshIp65504P633CoupamtL();
        }
   		return ip65504P633CoupamtL;
	}
	
	/**
	 * 	Update Ip65504P633CoupamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P633-COUPAMT-L
	 *	@param number
	 */
	public void setIp65504P633CoupamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P633CoupamtL = checkIp65504P633CoupamtLMaxLimit(number); 
		serializeIp65504P633CoupamtL(ip65504P633CoupamtL);
	}

	public void setIp65504P633CoupamtL(int number) {
	    number = checkIp65504P633CoupamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P633CoupamtL((short)number);
	}
	public void setIp65504P633CoupamtL(long number) {
	    number = checkIp65504P633CoupamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P633CoupamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P634Taxamt1S
	 *	@return ip65504P634Taxamt1S
	 */
	public short getIp65504P634Taxamt1S() throws CFException {
        if (isIp65504P634Taxamt1SModified()) { 
           ip65504P634Taxamt1S = refreshIp65504P634Taxamt1S();
        }
   		return ip65504P634Taxamt1S;
	}
	
	/**
	 * 	Update Ip65504P634Taxamt1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P634-TAXAMT1-S
	 *	@param number
	 */
	public void setIp65504P634Taxamt1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P634Taxamt1S = checkIp65504P634Taxamt1SMaxLimit(number); 
		serializeIp65504P634Taxamt1S(ip65504P634Taxamt1S);
	}

	public void setIp65504P634Taxamt1S(int number) {
	    number = checkIp65504P634Taxamt1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P634Taxamt1S((short)number);
	}
	public void setIp65504P634Taxamt1S(long number) {
	    number = checkIp65504P634Taxamt1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P634Taxamt1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P634Taxamt1L
	 *	@return ip65504P634Taxamt1L
	 */
	public short getIp65504P634Taxamt1L() throws CFException {
        if (isIp65504P634Taxamt1LModified()) { 
           ip65504P634Taxamt1L = refreshIp65504P634Taxamt1L();
        }
   		return ip65504P634Taxamt1L;
	}
	
	/**
	 * 	Update Ip65504P634Taxamt1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P634-TAXAMT1-L
	 *	@param number
	 */
	public void setIp65504P634Taxamt1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P634Taxamt1L = checkIp65504P634Taxamt1LMaxLimit(number); 
		serializeIp65504P634Taxamt1L(ip65504P634Taxamt1L);
	}

	public void setIp65504P634Taxamt1L(int number) {
	    number = checkIp65504P634Taxamt1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P634Taxamt1L((short)number);
	}
	public void setIp65504P634Taxamt1L(long number) {
	    number = checkIp65504P634Taxamt1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P634Taxamt1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P635Taxamt2S
	 *	@return ip65504P635Taxamt2S
	 */
	public short getIp65504P635Taxamt2S() throws CFException {
        if (isIp65504P635Taxamt2SModified()) { 
           ip65504P635Taxamt2S = refreshIp65504P635Taxamt2S();
        }
   		return ip65504P635Taxamt2S;
	}
	
	/**
	 * 	Update Ip65504P635Taxamt2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P635-TAXAMT2-S
	 *	@param number
	 */
	public void setIp65504P635Taxamt2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P635Taxamt2S = checkIp65504P635Taxamt2SMaxLimit(number); 
		serializeIp65504P635Taxamt2S(ip65504P635Taxamt2S);
	}

	public void setIp65504P635Taxamt2S(int number) {
	    number = checkIp65504P635Taxamt2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P635Taxamt2S((short)number);
	}
	public void setIp65504P635Taxamt2S(long number) {
	    number = checkIp65504P635Taxamt2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P635Taxamt2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P635Taxamt2L
	 *	@return ip65504P635Taxamt2L
	 */
	public short getIp65504P635Taxamt2L() throws CFException {
        if (isIp65504P635Taxamt2LModified()) { 
           ip65504P635Taxamt2L = refreshIp65504P635Taxamt2L();
        }
   		return ip65504P635Taxamt2L;
	}
	
	/**
	 * 	Update Ip65504P635Taxamt2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P635-TAXAMT2-L
	 *	@param number
	 */
	public void setIp65504P635Taxamt2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P635Taxamt2L = checkIp65504P635Taxamt2LMaxLimit(number); 
		serializeIp65504P635Taxamt2L(ip65504P635Taxamt2L);
	}

	public void setIp65504P635Taxamt2L(int number) {
	    number = checkIp65504P635Taxamt2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P635Taxamt2L((short)number);
	}
	public void setIp65504P635Taxamt2L(long number) {
	    number = checkIp65504P635Taxamt2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P635Taxamt2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P636ReservdS
	 *	@return ip65504P636ReservdS
	 */
	public short getIp65504P636ReservdS() throws CFException {
        if (isIp65504P636ReservdSModified()) { 
           ip65504P636ReservdS = refreshIp65504P636ReservdS();
        }
   		return ip65504P636ReservdS;
	}
	
	/**
	 * 	Update Ip65504P636ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P636-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P636ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P636ReservdS = checkIp65504P636ReservdSMaxLimit(number); 
		serializeIp65504P636ReservdS(ip65504P636ReservdS);
	}

	public void setIp65504P636ReservdS(int number) {
	    number = checkIp65504P636ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P636ReservdS((short)number);
	}
	public void setIp65504P636ReservdS(long number) {
	    number = checkIp65504P636ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P636ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P636ReservdL
	 *	@return ip65504P636ReservdL
	 */
	public short getIp65504P636ReservdL() throws CFException {
        if (isIp65504P636ReservdLModified()) { 
           ip65504P636ReservdL = refreshIp65504P636ReservdL();
        }
   		return ip65504P636ReservdL;
	}
	
	/**
	 * 	Update Ip65504P636ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P636-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P636ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P636ReservdL = checkIp65504P636ReservdLMaxLimit(number); 
		serializeIp65504P636ReservdL(ip65504P636ReservdL);
	}

	public void setIp65504P636ReservdL(int number) {
	    number = checkIp65504P636ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P636ReservdL((short)number);
	}
	public void setIp65504P636ReservdL(long number) {
	    number = checkIp65504P636ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P636ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P637ReservdS
	 *	@return ip65504P637ReservdS
	 */
	public short getIp65504P637ReservdS() throws CFException {
        if (isIp65504P637ReservdSModified()) { 
           ip65504P637ReservdS = refreshIp65504P637ReservdS();
        }
   		return ip65504P637ReservdS;
	}
	
	/**
	 * 	Update Ip65504P637ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P637-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P637ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P637ReservdS = checkIp65504P637ReservdSMaxLimit(number); 
		serializeIp65504P637ReservdS(ip65504P637ReservdS);
	}

	public void setIp65504P637ReservdS(int number) {
	    number = checkIp65504P637ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P637ReservdS((short)number);
	}
	public void setIp65504P637ReservdS(long number) {
	    number = checkIp65504P637ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P637ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P637ReservdL
	 *	@return ip65504P637ReservdL
	 */
	public short getIp65504P637ReservdL() throws CFException {
        if (isIp65504P637ReservdLModified()) { 
           ip65504P637ReservdL = refreshIp65504P637ReservdL();
        }
   		return ip65504P637ReservdL;
	}
	
	/**
	 * 	Update Ip65504P637ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P637-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P637ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P637ReservdL = checkIp65504P637ReservdLMaxLimit(number); 
		serializeIp65504P637ReservdL(ip65504P637ReservdL);
	}

	public void setIp65504P637ReservdL(int number) {
	    number = checkIp65504P637ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P637ReservdL((short)number);
	}
	public void setIp65504P637ReservdL(long number) {
	    number = checkIp65504P637ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P637ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P638ReservdS
	 *	@return ip65504P638ReservdS
	 */
	public short getIp65504P638ReservdS() throws CFException {
        if (isIp65504P638ReservdSModified()) { 
           ip65504P638ReservdS = refreshIp65504P638ReservdS();
        }
   		return ip65504P638ReservdS;
	}
	
	/**
	 * 	Update Ip65504P638ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P638-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P638ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P638ReservdS = checkIp65504P638ReservdSMaxLimit(number); 
		serializeIp65504P638ReservdS(ip65504P638ReservdS);
	}

	public void setIp65504P638ReservdS(int number) {
	    number = checkIp65504P638ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P638ReservdS((short)number);
	}
	public void setIp65504P638ReservdS(long number) {
	    number = checkIp65504P638ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P638ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P638ReservdL
	 *	@return ip65504P638ReservdL
	 */
	public short getIp65504P638ReservdL() throws CFException {
        if (isIp65504P638ReservdLModified()) { 
           ip65504P638ReservdL = refreshIp65504P638ReservdL();
        }
   		return ip65504P638ReservdL;
	}
	
	/**
	 * 	Update Ip65504P638ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P638-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P638ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P638ReservdL = checkIp65504P638ReservdLMaxLimit(number); 
		serializeIp65504P638ReservdL(ip65504P638ReservdL);
	}

	public void setIp65504P638ReservdL(int number) {
	    number = checkIp65504P638ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P638ReservdL((short)number);
	}
	public void setIp65504P638ReservdL(long number) {
	    number = checkIp65504P638ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P638ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P639ReservdS
	 *	@return ip65504P639ReservdS
	 */
	public short getIp65504P639ReservdS() throws CFException {
        if (isIp65504P639ReservdSModified()) { 
           ip65504P639ReservdS = refreshIp65504P639ReservdS();
        }
   		return ip65504P639ReservdS;
	}
	
	/**
	 * 	Update Ip65504P639ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P639-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P639ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P639ReservdS = checkIp65504P639ReservdSMaxLimit(number); 
		serializeIp65504P639ReservdS(ip65504P639ReservdS);
	}

	public void setIp65504P639ReservdS(int number) {
	    number = checkIp65504P639ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P639ReservdS((short)number);
	}
	public void setIp65504P639ReservdS(long number) {
	    number = checkIp65504P639ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P639ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P639ReservdL
	 *	@return ip65504P639ReservdL
	 */
	public short getIp65504P639ReservdL() throws CFException {
        if (isIp65504P639ReservdLModified()) { 
           ip65504P639ReservdL = refreshIp65504P639ReservdL();
        }
   		return ip65504P639ReservdL;
	}
	
	/**
	 * 	Update Ip65504P639ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P639-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P639ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P639ReservdL = checkIp65504P639ReservdLMaxLimit(number); 
		serializeIp65504P639ReservdL(ip65504P639ReservdL);
	}

	public void setIp65504P639ReservdL(int number) {
	    number = checkIp65504P639ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P639ReservdL((short)number);
	}
	public void setIp65504P639ReservdL(long number) {
	    number = checkIp65504P639ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P639ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P640ReservdS
	 *	@return ip65504P640ReservdS
	 */
	public short getIp65504P640ReservdS() throws CFException {
        if (isIp65504P640ReservdSModified()) { 
           ip65504P640ReservdS = refreshIp65504P640ReservdS();
        }
   		return ip65504P640ReservdS;
	}
	
	/**
	 * 	Update Ip65504P640ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P640-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P640ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P640ReservdS = checkIp65504P640ReservdSMaxLimit(number); 
		serializeIp65504P640ReservdS(ip65504P640ReservdS);
	}

	public void setIp65504P640ReservdS(int number) {
	    number = checkIp65504P640ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P640ReservdS((short)number);
	}
	public void setIp65504P640ReservdS(long number) {
	    number = checkIp65504P640ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P640ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P640ReservdL
	 *	@return ip65504P640ReservdL
	 */
	public short getIp65504P640ReservdL() throws CFException {
        if (isIp65504P640ReservdLModified()) { 
           ip65504P640ReservdL = refreshIp65504P640ReservdL();
        }
   		return ip65504P640ReservdL;
	}
	
	/**
	 * 	Update Ip65504P640ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P640-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P640ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P640ReservdL = checkIp65504P640ReservdLMaxLimit(number); 
		serializeIp65504P640ReservdL(ip65504P640ReservdL);
	}

	public void setIp65504P640ReservdL(int number) {
	    number = checkIp65504P640ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P640ReservdL((short)number);
	}
	public void setIp65504P640ReservdL(long number) {
	    number = checkIp65504P640ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P640ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P641ProdCdS
	 *	@return ip65504P641ProdCdS
	 */
	public short getIp65504P641ProdCdS() throws CFException {
        if (isIp65504P641ProdCdSModified()) { 
           ip65504P641ProdCdS = refreshIp65504P641ProdCdS();
        }
   		return ip65504P641ProdCdS;
	}
	
	/**
	 * 	Update Ip65504P641ProdCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P641-PROD-CD-S
	 *	@param number
	 */
	public void setIp65504P641ProdCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P641ProdCdS = checkIp65504P641ProdCdSMaxLimit(number); 
		serializeIp65504P641ProdCdS(ip65504P641ProdCdS);
	}

	public void setIp65504P641ProdCdS(int number) {
	    number = checkIp65504P641ProdCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P641ProdCdS((short)number);
	}
	public void setIp65504P641ProdCdS(long number) {
	    number = checkIp65504P641ProdCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P641ProdCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P641ProdCdL
	 *	@return ip65504P641ProdCdL
	 */
	public short getIp65504P641ProdCdL() throws CFException {
        if (isIp65504P641ProdCdLModified()) { 
           ip65504P641ProdCdL = refreshIp65504P641ProdCdL();
        }
   		return ip65504P641ProdCdL;
	}
	
	/**
	 * 	Update Ip65504P641ProdCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P641-PROD-CD-L
	 *	@param number
	 */
	public void setIp65504P641ProdCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P641ProdCdL = checkIp65504P641ProdCdLMaxLimit(number); 
		serializeIp65504P641ProdCdL(ip65504P641ProdCdL);
	}

	public void setIp65504P641ProdCdL(int number) {
	    number = checkIp65504P641ProdCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P641ProdCdL((short)number);
	}
	public void setIp65504P641ProdCdL(long number) {
	    number = checkIp65504P641ProdCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P641ProdCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P642ItmDesS
	 *	@return ip65504P642ItmDesS
	 */
	public short getIp65504P642ItmDesS() throws CFException {
        if (isIp65504P642ItmDesSModified()) { 
           ip65504P642ItmDesS = refreshIp65504P642ItmDesS();
        }
   		return ip65504P642ItmDesS;
	}
	
	/**
	 * 	Update Ip65504P642ItmDesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P642-ITM-DES-S
	 *	@param number
	 */
	public void setIp65504P642ItmDesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P642ItmDesS = checkIp65504P642ItmDesSMaxLimit(number); 
		serializeIp65504P642ItmDesS(ip65504P642ItmDesS);
	}

	public void setIp65504P642ItmDesS(int number) {
	    number = checkIp65504P642ItmDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P642ItmDesS((short)number);
	}
	public void setIp65504P642ItmDesS(long number) {
	    number = checkIp65504P642ItmDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P642ItmDesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P642ItmDesL
	 *	@return ip65504P642ItmDesL
	 */
	public short getIp65504P642ItmDesL() throws CFException {
        if (isIp65504P642ItmDesLModified()) { 
           ip65504P642ItmDesL = refreshIp65504P642ItmDesL();
        }
   		return ip65504P642ItmDesL;
	}
	
	/**
	 * 	Update Ip65504P642ItmDesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P642-ITM-DES-L
	 *	@param number
	 */
	public void setIp65504P642ItmDesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P642ItmDesL = checkIp65504P642ItmDesLMaxLimit(number); 
		serializeIp65504P642ItmDesL(ip65504P642ItmDesL);
	}

	public void setIp65504P642ItmDesL(int number) {
	    number = checkIp65504P642ItmDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P642ItmDesL((short)number);
	}
	public void setIp65504P642ItmDesL(long number) {
	    number = checkIp65504P642ItmDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P642ItmDesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P643ItmQtyS
	 *	@return ip65504P643ItmQtyS
	 */
	public short getIp65504P643ItmQtyS() throws CFException {
        if (isIp65504P643ItmQtySModified()) { 
           ip65504P643ItmQtyS = refreshIp65504P643ItmQtyS();
        }
   		return ip65504P643ItmQtyS;
	}
	
	/**
	 * 	Update Ip65504P643ItmQtyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P643-ITM-QTY-S
	 *	@param number
	 */
	public void setIp65504P643ItmQtyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P643ItmQtyS = checkIp65504P643ItmQtySMaxLimit(number); 
		serializeIp65504P643ItmQtyS(ip65504P643ItmQtyS);
	}

	public void setIp65504P643ItmQtyS(int number) {
	    number = checkIp65504P643ItmQtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P643ItmQtyS((short)number);
	}
	public void setIp65504P643ItmQtyS(long number) {
	    number = checkIp65504P643ItmQtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P643ItmQtyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P643ItmQtyL
	 *	@return ip65504P643ItmQtyL
	 */
	public short getIp65504P643ItmQtyL() throws CFException {
        if (isIp65504P643ItmQtyLModified()) { 
           ip65504P643ItmQtyL = refreshIp65504P643ItmQtyL();
        }
   		return ip65504P643ItmQtyL;
	}
	
	/**
	 * 	Update Ip65504P643ItmQtyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P643-ITM-QTY-L
	 *	@param number
	 */
	public void setIp65504P643ItmQtyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P643ItmQtyL = checkIp65504P643ItmQtyLMaxLimit(number); 
		serializeIp65504P643ItmQtyL(ip65504P643ItmQtyL);
	}

	public void setIp65504P643ItmQtyL(int number) {
	    number = checkIp65504P643ItmQtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P643ItmQtyL((short)number);
	}
	public void setIp65504P643ItmQtyL(long number) {
	    number = checkIp65504P643ItmQtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P643ItmQtyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P644ReservdS
	 *	@return ip65504P644ReservdS
	 */
	public short getIp65504P644ReservdS() throws CFException {
        if (isIp65504P644ReservdSModified()) { 
           ip65504P644ReservdS = refreshIp65504P644ReservdS();
        }
   		return ip65504P644ReservdS;
	}
	
	/**
	 * 	Update Ip65504P644ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P644-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P644ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P644ReservdS = checkIp65504P644ReservdSMaxLimit(number); 
		serializeIp65504P644ReservdS(ip65504P644ReservdS);
	}

	public void setIp65504P644ReservdS(int number) {
	    number = checkIp65504P644ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P644ReservdS((short)number);
	}
	public void setIp65504P644ReservdS(long number) {
	    number = checkIp65504P644ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P644ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P644ReservdL
	 *	@return ip65504P644ReservdL
	 */
	public short getIp65504P644ReservdL() throws CFException {
        if (isIp65504P644ReservdLModified()) { 
           ip65504P644ReservdL = refreshIp65504P644ReservdL();
        }
   		return ip65504P644ReservdL;
	}
	
	/**
	 * 	Update Ip65504P644ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P644-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P644ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P644ReservdL = checkIp65504P644ReservdLMaxLimit(number); 
		serializeIp65504P644ReservdL(ip65504P644ReservdL);
	}

	public void setIp65504P644ReservdL(int number) {
	    number = checkIp65504P644ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P644ReservdL((short)number);
	}
	public void setIp65504P644ReservdL(long number) {
	    number = checkIp65504P644ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P644ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P645ItmUomS
	 *	@return ip65504P645ItmUomS
	 */
	public short getIp65504P645ItmUomS() throws CFException {
        if (isIp65504P645ItmUomSModified()) { 
           ip65504P645ItmUomS = refreshIp65504P645ItmUomS();
        }
   		return ip65504P645ItmUomS;
	}
	
	/**
	 * 	Update Ip65504P645ItmUomS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P645-ITM-UOM-S
	 *	@param number
	 */
	public void setIp65504P645ItmUomS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P645ItmUomS = checkIp65504P645ItmUomSMaxLimit(number); 
		serializeIp65504P645ItmUomS(ip65504P645ItmUomS);
	}

	public void setIp65504P645ItmUomS(int number) {
	    number = checkIp65504P645ItmUomSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P645ItmUomS((short)number);
	}
	public void setIp65504P645ItmUomS(long number) {
	    number = checkIp65504P645ItmUomSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P645ItmUomS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P645ItmUomL
	 *	@return ip65504P645ItmUomL
	 */
	public short getIp65504P645ItmUomL() throws CFException {
        if (isIp65504P645ItmUomLModified()) { 
           ip65504P645ItmUomL = refreshIp65504P645ItmUomL();
        }
   		return ip65504P645ItmUomL;
	}
	
	/**
	 * 	Update Ip65504P645ItmUomL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P645-ITM-UOM-L
	 *	@param number
	 */
	public void setIp65504P645ItmUomL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P645ItmUomL = checkIp65504P645ItmUomLMaxLimit(number); 
		serializeIp65504P645ItmUomL(ip65504P645ItmUomL);
	}

	public void setIp65504P645ItmUomL(int number) {
	    number = checkIp65504P645ItmUomLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P645ItmUomL((short)number);
	}
	public void setIp65504P645ItmUomL(long number) {
	    number = checkIp65504P645ItmUomLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P645ItmUomL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P646UnitprcS
	 *	@return ip65504P646UnitprcS
	 */
	public short getIp65504P646UnitprcS() throws CFException {
        if (isIp65504P646UnitprcSModified()) { 
           ip65504P646UnitprcS = refreshIp65504P646UnitprcS();
        }
   		return ip65504P646UnitprcS;
	}
	
	/**
	 * 	Update Ip65504P646UnitprcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P646-UNITPRC-S
	 *	@param number
	 */
	public void setIp65504P646UnitprcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P646UnitprcS = checkIp65504P646UnitprcSMaxLimit(number); 
		serializeIp65504P646UnitprcS(ip65504P646UnitprcS);
	}

	public void setIp65504P646UnitprcS(int number) {
	    number = checkIp65504P646UnitprcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P646UnitprcS((short)number);
	}
	public void setIp65504P646UnitprcS(long number) {
	    number = checkIp65504P646UnitprcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P646UnitprcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P646UnitprcL
	 *	@return ip65504P646UnitprcL
	 */
	public short getIp65504P646UnitprcL() throws CFException {
        if (isIp65504P646UnitprcLModified()) { 
           ip65504P646UnitprcL = refreshIp65504P646UnitprcL();
        }
   		return ip65504P646UnitprcL;
	}
	
	/**
	 * 	Update Ip65504P646UnitprcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P646-UNITPRC-L
	 *	@param number
	 */
	public void setIp65504P646UnitprcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P646UnitprcL = checkIp65504P646UnitprcLMaxLimit(number); 
		serializeIp65504P646UnitprcL(ip65504P646UnitprcL);
	}

	public void setIp65504P646UnitprcL(int number) {
	    number = checkIp65504P646UnitprcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P646UnitprcL((short)number);
	}
	public void setIp65504P646UnitprcL(long number) {
	    number = checkIp65504P646UnitprcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P646UnitprcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P647ExtAmtS
	 *	@return ip65504P647ExtAmtS
	 */
	public short getIp65504P647ExtAmtS() throws CFException {
        if (isIp65504P647ExtAmtSModified()) { 
           ip65504P647ExtAmtS = refreshIp65504P647ExtAmtS();
        }
   		return ip65504P647ExtAmtS;
	}
	
	/**
	 * 	Update Ip65504P647ExtAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P647-EXT-AMT-S
	 *	@param number
	 */
	public void setIp65504P647ExtAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P647ExtAmtS = checkIp65504P647ExtAmtSMaxLimit(number); 
		serializeIp65504P647ExtAmtS(ip65504P647ExtAmtS);
	}

	public void setIp65504P647ExtAmtS(int number) {
	    number = checkIp65504P647ExtAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P647ExtAmtS((short)number);
	}
	public void setIp65504P647ExtAmtS(long number) {
	    number = checkIp65504P647ExtAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P647ExtAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P647ExtAmtL
	 *	@return ip65504P647ExtAmtL
	 */
	public short getIp65504P647ExtAmtL() throws CFException {
        if (isIp65504P647ExtAmtLModified()) { 
           ip65504P647ExtAmtL = refreshIp65504P647ExtAmtL();
        }
   		return ip65504P647ExtAmtL;
	}
	
	/**
	 * 	Update Ip65504P647ExtAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P647-EXT-AMT-L
	 *	@param number
	 */
	public void setIp65504P647ExtAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P647ExtAmtL = checkIp65504P647ExtAmtLMaxLimit(number); 
		serializeIp65504P647ExtAmtL(ip65504P647ExtAmtL);
	}

	public void setIp65504P647ExtAmtL(int number) {
	    number = checkIp65504P647ExtAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P647ExtAmtL((short)number);
	}
	public void setIp65504P647ExtAmtL(long number) {
	    number = checkIp65504P647ExtAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P647ExtAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P648ItmdsctS
	 *	@return ip65504P648ItmdsctS
	 */
	public short getIp65504P648ItmdsctS() throws CFException {
        if (isIp65504P648ItmdsctSModified()) { 
           ip65504P648ItmdsctS = refreshIp65504P648ItmdsctS();
        }
   		return ip65504P648ItmdsctS;
	}
	
	/**
	 * 	Update Ip65504P648ItmdsctS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P648-ITMDSCT-S
	 *	@param number
	 */
	public void setIp65504P648ItmdsctS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P648ItmdsctS = checkIp65504P648ItmdsctSMaxLimit(number); 
		serializeIp65504P648ItmdsctS(ip65504P648ItmdsctS);
	}

	public void setIp65504P648ItmdsctS(int number) {
	    number = checkIp65504P648ItmdsctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P648ItmdsctS((short)number);
	}
	public void setIp65504P648ItmdsctS(long number) {
	    number = checkIp65504P648ItmdsctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P648ItmdsctS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P648ItmdsctL
	 *	@return ip65504P648ItmdsctL
	 */
	public short getIp65504P648ItmdsctL() throws CFException {
        if (isIp65504P648ItmdsctLModified()) { 
           ip65504P648ItmdsctL = refreshIp65504P648ItmdsctL();
        }
   		return ip65504P648ItmdsctL;
	}
	
	/**
	 * 	Update Ip65504P648ItmdsctL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P648-ITMDSCT-L
	 *	@param number
	 */
	public void setIp65504P648ItmdsctL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P648ItmdsctL = checkIp65504P648ItmdsctLMaxLimit(number); 
		serializeIp65504P648ItmdsctL(ip65504P648ItmdsctL);
	}

	public void setIp65504P648ItmdsctL(int number) {
	    number = checkIp65504P648ItmdsctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P648ItmdsctL((short)number);
	}
	public void setIp65504P648ItmdsctL(long number) {
	    number = checkIp65504P648ItmdsctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P648ItmdsctL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P649ReservdS
	 *	@return ip65504P649ReservdS
	 */
	public short getIp65504P649ReservdS() throws CFException {
        if (isIp65504P649ReservdSModified()) { 
           ip65504P649ReservdS = refreshIp65504P649ReservdS();
        }
   		return ip65504P649ReservdS;
	}
	
	/**
	 * 	Update Ip65504P649ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P649-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P649ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P649ReservdS = checkIp65504P649ReservdSMaxLimit(number); 
		serializeIp65504P649ReservdS(ip65504P649ReservdS);
	}

	public void setIp65504P649ReservdS(int number) {
	    number = checkIp65504P649ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P649ReservdS((short)number);
	}
	public void setIp65504P649ReservdS(long number) {
	    number = checkIp65504P649ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P649ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P649ReservdL
	 *	@return ip65504P649ReservdL
	 */
	public short getIp65504P649ReservdL() throws CFException {
        if (isIp65504P649ReservdLModified()) { 
           ip65504P649ReservdL = refreshIp65504P649ReservdL();
        }
   		return ip65504P649ReservdL;
	}
	
	/**
	 * 	Update Ip65504P649ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P649-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P649ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P649ReservdL = checkIp65504P649ReservdLMaxLimit(number); 
		serializeIp65504P649ReservdL(ip65504P649ReservdL);
	}

	public void setIp65504P649ReservdL(int number) {
	    number = checkIp65504P649ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P649ReservdL((short)number);
	}
	public void setIp65504P649ReservdL(long number) {
	    number = checkIp65504P649ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P649ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P650NetGrsS
	 *	@return ip65504P650NetGrsS
	 */
	public short getIp65504P650NetGrsS() throws CFException {
        if (isIp65504P650NetGrsSModified()) { 
           ip65504P650NetGrsS = refreshIp65504P650NetGrsS();
        }
   		return ip65504P650NetGrsS;
	}
	
	/**
	 * 	Update Ip65504P650NetGrsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P650-NET-GRS-S
	 *	@param number
	 */
	public void setIp65504P650NetGrsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P650NetGrsS = checkIp65504P650NetGrsSMaxLimit(number); 
		serializeIp65504P650NetGrsS(ip65504P650NetGrsS);
	}

	public void setIp65504P650NetGrsS(int number) {
	    number = checkIp65504P650NetGrsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P650NetGrsS((short)number);
	}
	public void setIp65504P650NetGrsS(long number) {
	    number = checkIp65504P650NetGrsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P650NetGrsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P650NetGrsL
	 *	@return ip65504P650NetGrsL
	 */
	public short getIp65504P650NetGrsL() throws CFException {
        if (isIp65504P650NetGrsLModified()) { 
           ip65504P650NetGrsL = refreshIp65504P650NetGrsL();
        }
   		return ip65504P650NetGrsL;
	}
	
	/**
	 * 	Update Ip65504P650NetGrsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P650-NET-GRS-L
	 *	@param number
	 */
	public void setIp65504P650NetGrsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P650NetGrsL = checkIp65504P650NetGrsLMaxLimit(number); 
		serializeIp65504P650NetGrsL(ip65504P650NetGrsL);
	}

	public void setIp65504P650NetGrsL(int number) {
	    number = checkIp65504P650NetGrsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P650NetGrsL((short)number);
	}
	public void setIp65504P650NetGrsL(long number) {
	    number = checkIp65504P650NetGrsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P650NetGrsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P651TaxRteS
	 *	@return ip65504P651TaxRteS
	 */
	public short getIp65504P651TaxRteS() throws CFException {
        if (isIp65504P651TaxRteSModified()) { 
           ip65504P651TaxRteS = refreshIp65504P651TaxRteS();
        }
   		return ip65504P651TaxRteS;
	}
	
	/**
	 * 	Update Ip65504P651TaxRteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P651-TAX-RTE-S
	 *	@param number
	 */
	public void setIp65504P651TaxRteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P651TaxRteS = checkIp65504P651TaxRteSMaxLimit(number); 
		serializeIp65504P651TaxRteS(ip65504P651TaxRteS);
	}

	public void setIp65504P651TaxRteS(int number) {
	    number = checkIp65504P651TaxRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P651TaxRteS((short)number);
	}
	public void setIp65504P651TaxRteS(long number) {
	    number = checkIp65504P651TaxRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P651TaxRteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P651TaxRteL
	 *	@return ip65504P651TaxRteL
	 */
	public short getIp65504P651TaxRteL() throws CFException {
        if (isIp65504P651TaxRteLModified()) { 
           ip65504P651TaxRteL = refreshIp65504P651TaxRteL();
        }
   		return ip65504P651TaxRteL;
	}
	
	/**
	 * 	Update Ip65504P651TaxRteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P651-TAX-RTE-L
	 *	@param number
	 */
	public void setIp65504P651TaxRteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P651TaxRteL = checkIp65504P651TaxRteLMaxLimit(number); 
		serializeIp65504P651TaxRteL(ip65504P651TaxRteL);
	}

	public void setIp65504P651TaxRteL(int number) {
	    number = checkIp65504P651TaxRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P651TaxRteL((short)number);
	}
	public void setIp65504P651TaxRteL(long number) {
	    number = checkIp65504P651TaxRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P651TaxRteL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P621PurTimS((short)0);
         	setIp65504P621PurTimL((short)0);
         	setIp65504P622MtrSvcS((short)0);
         	setIp65504P622MtrSvcL((short)0);
         	setIp65504P623MtrfuelS((short)0);
         	setIp65504P623MtrfuelL((short)0);
         	setIp65504P624ReservdS((short)0);
         	setIp65504P624ReservdL((short)0);
         	setIp65504P625ReservdS((short)0);
         	setIp65504P625ReservdL((short)0);
         	setIp65504P626ReservdS((short)0);
         	setIp65504P626ReservdL((short)0);
         	setIp65504P627ReservdS((short)0);
         	setIp65504P627ReservdL((short)0);
         	setIp65504P628ReservdS((short)0);
         	setIp65504P628ReservdL((short)0);
         	setIp65504P629OdometrS((short)0);
         	setIp65504P629OdometrL((short)0);
         	setIp65504P630VehNbrS((short)0);
         	setIp65504P630VehNbrL((short)0);
         	setIp65504P631DrvrNoS((short)0);
         	setIp65504P631DrvrNoL((short)0);
         	setIp65504P632ProdCdS((short)0);
         	setIp65504P632ProdCdL((short)0);
         	setIp65504P633CoupamtS((short)0);
         	setIp65504P633CoupamtL((short)0);
         	setIp65504P634Taxamt1S((short)0);
         	setIp65504P634Taxamt1L((short)0);
         	setIp65504P635Taxamt2S((short)0);
         	setIp65504P635Taxamt2L((short)0);
         	setIp65504P636ReservdS((short)0);
         	setIp65504P636ReservdL((short)0);
         	setIp65504P637ReservdS((short)0);
         	setIp65504P637ReservdL((short)0);
         	setIp65504P638ReservdS((short)0);
         	setIp65504P638ReservdL((short)0);
         	setIp65504P639ReservdS((short)0);
         	setIp65504P639ReservdL((short)0);
         	setIp65504P640ReservdS((short)0);
         	setIp65504P640ReservdL((short)0);
         	setIp65504P641ProdCdS((short)0);
         	setIp65504P641ProdCdL((short)0);
         	setIp65504P642ItmDesS((short)0);
         	setIp65504P642ItmDesL((short)0);
         	setIp65504P643ItmQtyS((short)0);
         	setIp65504P643ItmQtyL((short)0);
         	setIp65504P644ReservdS((short)0);
         	setIp65504P644ReservdL((short)0);
         	setIp65504P645ItmUomS((short)0);
         	setIp65504P645ItmUomL((short)0);
         	setIp65504P646UnitprcS((short)0);
         	setIp65504P646UnitprcL((short)0);
         	setIp65504P647ExtAmtS((short)0);
         	setIp65504P647ExtAmtL((short)0);
         	setIp65504P648ItmdsctS((short)0);
         	setIp65504P648ItmdsctL((short)0);
         	setIp65504P649ReservdS((short)0);
         	setIp65504P649ReservdL((short)0);
         	setIp65504P650NetGrsS((short)0);
         	setIp65504P650NetGrsL((short)0);
         	setIp65504P651TaxRteS((short)0);
         	setIp65504P651TaxRteL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup21FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_21_LENGTH;
		}

}
  
