package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup19 extends Ip65504PdsNamesLargeGroup19Serialized { 
   

								private short ip65504P559VehInsS;

								private short ip65504P559VehInsL;


								private short ip65504P560ReservdS;

								private short ip65504P560ReservdL;


								private short ip65504P561AdjAmtS;

								private short ip65504P561AdjAmtL;


								private short ip65504P562ReservdS;

								private short ip65504P562ReservdL;


								private short ip65504P563PgmCodS;

								private short ip65504P563PgmCodL;


								private short ip65504P564RntcityS;

								private short ip65504P564RntcityL;


								private short ip65504P565RentStS;

								private short ip65504P565RentStL;


								private short ip65504P566RntctryS;

								private short ip65504P566RntctryL;


								private short ip65504P567RntLocS;

								private short ip65504P567RntLocL;


								private short ip65504P568RntClsS;

								private short ip65504P568RntClsL;


								private short ip65504P569ReservdS;

								private short ip65504P569ReservdL;


								private short ip65504P570ReservdS;

								private short ip65504P570ReservdL;


								private short ip65504P571ReservdS;

								private short ip65504P571ReservdL;


								private short ip65504P572ReservdS;

								private short ip65504P572ReservdL;


								private short ip65504P573ReservdS;

								private short ip65504P573ReservdL;


								private short ip65504P574ArvDteS;

								private short ip65504P574ArvDteL;


								private short ip65504P575DepDteS;

								private short ip65504P575DepDteL;


								private short ip65504P576FolioNS;

								private short ip65504P576FolioNL;


								private short ip65504P577PrpTelS;

								private short ip65504P577PrpTelL;


								private short ip65504P578BilAdjS;

								private short ip65504P578BilAdjL;


								private short ip65504P579ReservdS;

								private short ip65504P579ReservdL;


								private short ip65504P580RoomRtS;

								private short ip65504P580RoomRtL;


								private short ip65504P581RoomTxS;

								private short ip65504P581RoomTxL;


								private short ip65504P582PgmCodS;

								private short ip65504P582PgmCodL;


								private short ip65504P583TelChgS;

								private short ip65504P583TelChgL;


								private short ip65504P584RstChgS;

								private short ip65504P584RstChgL;


								private short ip65504P585BarChgS;

								private short ip65504P585BarChgL;


								private short ip65504P586GifChgS;

								private short ip65504P586GifChgL;


								private short ip65504P587LauChgS;

								private short ip65504P587LauChgL;


								private short ip65504P588OthSvcS;

								private short ip65504P588OthSvcL;


								private short ip65504P589ReservdS;

								private short ip65504P589ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup19
	**/
    public Ip65504PdsNamesLargeGroup19() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P559VehInsS
	 *	@return ip65504P559VehInsS
	 */
	public short getIp65504P559VehInsS() throws CFException {
        if (isIp65504P559VehInsSModified()) { 
           ip65504P559VehInsS = refreshIp65504P559VehInsS();
        }
   		return ip65504P559VehInsS;
	}
	
	/**
	 * 	Update Ip65504P559VehInsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P559-VEH-INS-S
	 *	@param number
	 */
	public void setIp65504P559VehInsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P559VehInsS = checkIp65504P559VehInsSMaxLimit(number); 
		serializeIp65504P559VehInsS(ip65504P559VehInsS);
	}

	public void setIp65504P559VehInsS(int number) {
	    number = checkIp65504P559VehInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P559VehInsS((short)number);
	}
	public void setIp65504P559VehInsS(long number) {
	    number = checkIp65504P559VehInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P559VehInsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P559VehInsL
	 *	@return ip65504P559VehInsL
	 */
	public short getIp65504P559VehInsL() throws CFException {
        if (isIp65504P559VehInsLModified()) { 
           ip65504P559VehInsL = refreshIp65504P559VehInsL();
        }
   		return ip65504P559VehInsL;
	}
	
	/**
	 * 	Update Ip65504P559VehInsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P559-VEH-INS-L
	 *	@param number
	 */
	public void setIp65504P559VehInsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P559VehInsL = checkIp65504P559VehInsLMaxLimit(number); 
		serializeIp65504P559VehInsL(ip65504P559VehInsL);
	}

	public void setIp65504P559VehInsL(int number) {
	    number = checkIp65504P559VehInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P559VehInsL((short)number);
	}
	public void setIp65504P559VehInsL(long number) {
	    number = checkIp65504P559VehInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P559VehInsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P560ReservdS
	 *	@return ip65504P560ReservdS
	 */
	public short getIp65504P560ReservdS() throws CFException {
        if (isIp65504P560ReservdSModified()) { 
           ip65504P560ReservdS = refreshIp65504P560ReservdS();
        }
   		return ip65504P560ReservdS;
	}
	
	/**
	 * 	Update Ip65504P560ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P560-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P560ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P560ReservdS = checkIp65504P560ReservdSMaxLimit(number); 
		serializeIp65504P560ReservdS(ip65504P560ReservdS);
	}

	public void setIp65504P560ReservdS(int number) {
	    number = checkIp65504P560ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P560ReservdS((short)number);
	}
	public void setIp65504P560ReservdS(long number) {
	    number = checkIp65504P560ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P560ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P560ReservdL
	 *	@return ip65504P560ReservdL
	 */
	public short getIp65504P560ReservdL() throws CFException {
        if (isIp65504P560ReservdLModified()) { 
           ip65504P560ReservdL = refreshIp65504P560ReservdL();
        }
   		return ip65504P560ReservdL;
	}
	
	/**
	 * 	Update Ip65504P560ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P560-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P560ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P560ReservdL = checkIp65504P560ReservdLMaxLimit(number); 
		serializeIp65504P560ReservdL(ip65504P560ReservdL);
	}

	public void setIp65504P560ReservdL(int number) {
	    number = checkIp65504P560ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P560ReservdL((short)number);
	}
	public void setIp65504P560ReservdL(long number) {
	    number = checkIp65504P560ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P560ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P561AdjAmtS
	 *	@return ip65504P561AdjAmtS
	 */
	public short getIp65504P561AdjAmtS() throws CFException {
        if (isIp65504P561AdjAmtSModified()) { 
           ip65504P561AdjAmtS = refreshIp65504P561AdjAmtS();
        }
   		return ip65504P561AdjAmtS;
	}
	
	/**
	 * 	Update Ip65504P561AdjAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P561-ADJ-AMT-S
	 *	@param number
	 */
	public void setIp65504P561AdjAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P561AdjAmtS = checkIp65504P561AdjAmtSMaxLimit(number); 
		serializeIp65504P561AdjAmtS(ip65504P561AdjAmtS);
	}

	public void setIp65504P561AdjAmtS(int number) {
	    number = checkIp65504P561AdjAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P561AdjAmtS((short)number);
	}
	public void setIp65504P561AdjAmtS(long number) {
	    number = checkIp65504P561AdjAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P561AdjAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P561AdjAmtL
	 *	@return ip65504P561AdjAmtL
	 */
	public short getIp65504P561AdjAmtL() throws CFException {
        if (isIp65504P561AdjAmtLModified()) { 
           ip65504P561AdjAmtL = refreshIp65504P561AdjAmtL();
        }
   		return ip65504P561AdjAmtL;
	}
	
	/**
	 * 	Update Ip65504P561AdjAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P561-ADJ-AMT-L
	 *	@param number
	 */
	public void setIp65504P561AdjAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P561AdjAmtL = checkIp65504P561AdjAmtLMaxLimit(number); 
		serializeIp65504P561AdjAmtL(ip65504P561AdjAmtL);
	}

	public void setIp65504P561AdjAmtL(int number) {
	    number = checkIp65504P561AdjAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P561AdjAmtL((short)number);
	}
	public void setIp65504P561AdjAmtL(long number) {
	    number = checkIp65504P561AdjAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P561AdjAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P562ReservdS
	 *	@return ip65504P562ReservdS
	 */
	public short getIp65504P562ReservdS() throws CFException {
        if (isIp65504P562ReservdSModified()) { 
           ip65504P562ReservdS = refreshIp65504P562ReservdS();
        }
   		return ip65504P562ReservdS;
	}
	
	/**
	 * 	Update Ip65504P562ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P562-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P562ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P562ReservdS = checkIp65504P562ReservdSMaxLimit(number); 
		serializeIp65504P562ReservdS(ip65504P562ReservdS);
	}

	public void setIp65504P562ReservdS(int number) {
	    number = checkIp65504P562ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P562ReservdS((short)number);
	}
	public void setIp65504P562ReservdS(long number) {
	    number = checkIp65504P562ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P562ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P562ReservdL
	 *	@return ip65504P562ReservdL
	 */
	public short getIp65504P562ReservdL() throws CFException {
        if (isIp65504P562ReservdLModified()) { 
           ip65504P562ReservdL = refreshIp65504P562ReservdL();
        }
   		return ip65504P562ReservdL;
	}
	
	/**
	 * 	Update Ip65504P562ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P562-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P562ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P562ReservdL = checkIp65504P562ReservdLMaxLimit(number); 
		serializeIp65504P562ReservdL(ip65504P562ReservdL);
	}

	public void setIp65504P562ReservdL(int number) {
	    number = checkIp65504P562ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P562ReservdL((short)number);
	}
	public void setIp65504P562ReservdL(long number) {
	    number = checkIp65504P562ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P562ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P563PgmCodS
	 *	@return ip65504P563PgmCodS
	 */
	public short getIp65504P563PgmCodS() throws CFException {
        if (isIp65504P563PgmCodSModified()) { 
           ip65504P563PgmCodS = refreshIp65504P563PgmCodS();
        }
   		return ip65504P563PgmCodS;
	}
	
	/**
	 * 	Update Ip65504P563PgmCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P563-PGM-COD-S
	 *	@param number
	 */
	public void setIp65504P563PgmCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P563PgmCodS = checkIp65504P563PgmCodSMaxLimit(number); 
		serializeIp65504P563PgmCodS(ip65504P563PgmCodS);
	}

	public void setIp65504P563PgmCodS(int number) {
	    number = checkIp65504P563PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P563PgmCodS((short)number);
	}
	public void setIp65504P563PgmCodS(long number) {
	    number = checkIp65504P563PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P563PgmCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P563PgmCodL
	 *	@return ip65504P563PgmCodL
	 */
	public short getIp65504P563PgmCodL() throws CFException {
        if (isIp65504P563PgmCodLModified()) { 
           ip65504P563PgmCodL = refreshIp65504P563PgmCodL();
        }
   		return ip65504P563PgmCodL;
	}
	
	/**
	 * 	Update Ip65504P563PgmCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P563-PGM-COD-L
	 *	@param number
	 */
	public void setIp65504P563PgmCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P563PgmCodL = checkIp65504P563PgmCodLMaxLimit(number); 
		serializeIp65504P563PgmCodL(ip65504P563PgmCodL);
	}

	public void setIp65504P563PgmCodL(int number) {
	    number = checkIp65504P563PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P563PgmCodL((short)number);
	}
	public void setIp65504P563PgmCodL(long number) {
	    number = checkIp65504P563PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P563PgmCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P564RntcityS
	 *	@return ip65504P564RntcityS
	 */
	public short getIp65504P564RntcityS() throws CFException {
        if (isIp65504P564RntcitySModified()) { 
           ip65504P564RntcityS = refreshIp65504P564RntcityS();
        }
   		return ip65504P564RntcityS;
	}
	
	/**
	 * 	Update Ip65504P564RntcityS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P564-RNTCITY-S
	 *	@param number
	 */
	public void setIp65504P564RntcityS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P564RntcityS = checkIp65504P564RntcitySMaxLimit(number); 
		serializeIp65504P564RntcityS(ip65504P564RntcityS);
	}

	public void setIp65504P564RntcityS(int number) {
	    number = checkIp65504P564RntcitySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P564RntcityS((short)number);
	}
	public void setIp65504P564RntcityS(long number) {
	    number = checkIp65504P564RntcitySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P564RntcityS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P564RntcityL
	 *	@return ip65504P564RntcityL
	 */
	public short getIp65504P564RntcityL() throws CFException {
        if (isIp65504P564RntcityLModified()) { 
           ip65504P564RntcityL = refreshIp65504P564RntcityL();
        }
   		return ip65504P564RntcityL;
	}
	
	/**
	 * 	Update Ip65504P564RntcityL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P564-RNTCITY-L
	 *	@param number
	 */
	public void setIp65504P564RntcityL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P564RntcityL = checkIp65504P564RntcityLMaxLimit(number); 
		serializeIp65504P564RntcityL(ip65504P564RntcityL);
	}

	public void setIp65504P564RntcityL(int number) {
	    number = checkIp65504P564RntcityLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P564RntcityL((short)number);
	}
	public void setIp65504P564RntcityL(long number) {
	    number = checkIp65504P564RntcityLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P564RntcityL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P565RentStS
	 *	@return ip65504P565RentStS
	 */
	public short getIp65504P565RentStS() throws CFException {
        if (isIp65504P565RentStSModified()) { 
           ip65504P565RentStS = refreshIp65504P565RentStS();
        }
   		return ip65504P565RentStS;
	}
	
	/**
	 * 	Update Ip65504P565RentStS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P565-RENT-ST-S
	 *	@param number
	 */
	public void setIp65504P565RentStS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P565RentStS = checkIp65504P565RentStSMaxLimit(number); 
		serializeIp65504P565RentStS(ip65504P565RentStS);
	}

	public void setIp65504P565RentStS(int number) {
	    number = checkIp65504P565RentStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P565RentStS((short)number);
	}
	public void setIp65504P565RentStS(long number) {
	    number = checkIp65504P565RentStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P565RentStS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P565RentStL
	 *	@return ip65504P565RentStL
	 */
	public short getIp65504P565RentStL() throws CFException {
        if (isIp65504P565RentStLModified()) { 
           ip65504P565RentStL = refreshIp65504P565RentStL();
        }
   		return ip65504P565RentStL;
	}
	
	/**
	 * 	Update Ip65504P565RentStL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P565-RENT-ST-L
	 *	@param number
	 */
	public void setIp65504P565RentStL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P565RentStL = checkIp65504P565RentStLMaxLimit(number); 
		serializeIp65504P565RentStL(ip65504P565RentStL);
	}

	public void setIp65504P565RentStL(int number) {
	    number = checkIp65504P565RentStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P565RentStL((short)number);
	}
	public void setIp65504P565RentStL(long number) {
	    number = checkIp65504P565RentStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P565RentStL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P566RntctryS
	 *	@return ip65504P566RntctryS
	 */
	public short getIp65504P566RntctryS() throws CFException {
        if (isIp65504P566RntctrySModified()) { 
           ip65504P566RntctryS = refreshIp65504P566RntctryS();
        }
   		return ip65504P566RntctryS;
	}
	
	/**
	 * 	Update Ip65504P566RntctryS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P566-RNTCTRY-S
	 *	@param number
	 */
	public void setIp65504P566RntctryS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P566RntctryS = checkIp65504P566RntctrySMaxLimit(number); 
		serializeIp65504P566RntctryS(ip65504P566RntctryS);
	}

	public void setIp65504P566RntctryS(int number) {
	    number = checkIp65504P566RntctrySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P566RntctryS((short)number);
	}
	public void setIp65504P566RntctryS(long number) {
	    number = checkIp65504P566RntctrySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P566RntctryS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P566RntctryL
	 *	@return ip65504P566RntctryL
	 */
	public short getIp65504P566RntctryL() throws CFException {
        if (isIp65504P566RntctryLModified()) { 
           ip65504P566RntctryL = refreshIp65504P566RntctryL();
        }
   		return ip65504P566RntctryL;
	}
	
	/**
	 * 	Update Ip65504P566RntctryL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P566-RNTCTRY-L
	 *	@param number
	 */
	public void setIp65504P566RntctryL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P566RntctryL = checkIp65504P566RntctryLMaxLimit(number); 
		serializeIp65504P566RntctryL(ip65504P566RntctryL);
	}

	public void setIp65504P566RntctryL(int number) {
	    number = checkIp65504P566RntctryLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P566RntctryL((short)number);
	}
	public void setIp65504P566RntctryL(long number) {
	    number = checkIp65504P566RntctryLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P566RntctryL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P567RntLocS
	 *	@return ip65504P567RntLocS
	 */
	public short getIp65504P567RntLocS() throws CFException {
        if (isIp65504P567RntLocSModified()) { 
           ip65504P567RntLocS = refreshIp65504P567RntLocS();
        }
   		return ip65504P567RntLocS;
	}
	
	/**
	 * 	Update Ip65504P567RntLocS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P567-RNT-LOC-S
	 *	@param number
	 */
	public void setIp65504P567RntLocS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P567RntLocS = checkIp65504P567RntLocSMaxLimit(number); 
		serializeIp65504P567RntLocS(ip65504P567RntLocS);
	}

	public void setIp65504P567RntLocS(int number) {
	    number = checkIp65504P567RntLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P567RntLocS((short)number);
	}
	public void setIp65504P567RntLocS(long number) {
	    number = checkIp65504P567RntLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P567RntLocS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P567RntLocL
	 *	@return ip65504P567RntLocL
	 */
	public short getIp65504P567RntLocL() throws CFException {
        if (isIp65504P567RntLocLModified()) { 
           ip65504P567RntLocL = refreshIp65504P567RntLocL();
        }
   		return ip65504P567RntLocL;
	}
	
	/**
	 * 	Update Ip65504P567RntLocL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P567-RNT-LOC-L
	 *	@param number
	 */
	public void setIp65504P567RntLocL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P567RntLocL = checkIp65504P567RntLocLMaxLimit(number); 
		serializeIp65504P567RntLocL(ip65504P567RntLocL);
	}

	public void setIp65504P567RntLocL(int number) {
	    number = checkIp65504P567RntLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P567RntLocL((short)number);
	}
	public void setIp65504P567RntLocL(long number) {
	    number = checkIp65504P567RntLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P567RntLocL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P568RntClsS
	 *	@return ip65504P568RntClsS
	 */
	public short getIp65504P568RntClsS() throws CFException {
        if (isIp65504P568RntClsSModified()) { 
           ip65504P568RntClsS = refreshIp65504P568RntClsS();
        }
   		return ip65504P568RntClsS;
	}
	
	/**
	 * 	Update Ip65504P568RntClsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P568-RNT-CLS-S
	 *	@param number
	 */
	public void setIp65504P568RntClsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P568RntClsS = checkIp65504P568RntClsSMaxLimit(number); 
		serializeIp65504P568RntClsS(ip65504P568RntClsS);
	}

	public void setIp65504P568RntClsS(int number) {
	    number = checkIp65504P568RntClsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P568RntClsS((short)number);
	}
	public void setIp65504P568RntClsS(long number) {
	    number = checkIp65504P568RntClsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P568RntClsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P568RntClsL
	 *	@return ip65504P568RntClsL
	 */
	public short getIp65504P568RntClsL() throws CFException {
        if (isIp65504P568RntClsLModified()) { 
           ip65504P568RntClsL = refreshIp65504P568RntClsL();
        }
   		return ip65504P568RntClsL;
	}
	
	/**
	 * 	Update Ip65504P568RntClsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P568-RNT-CLS-L
	 *	@param number
	 */
	public void setIp65504P568RntClsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P568RntClsL = checkIp65504P568RntClsLMaxLimit(number); 
		serializeIp65504P568RntClsL(ip65504P568RntClsL);
	}

	public void setIp65504P568RntClsL(int number) {
	    number = checkIp65504P568RntClsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P568RntClsL((short)number);
	}
	public void setIp65504P568RntClsL(long number) {
	    number = checkIp65504P568RntClsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P568RntClsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P569ReservdS
	 *	@return ip65504P569ReservdS
	 */
	public short getIp65504P569ReservdS() throws CFException {
        if (isIp65504P569ReservdSModified()) { 
           ip65504P569ReservdS = refreshIp65504P569ReservdS();
        }
   		return ip65504P569ReservdS;
	}
	
	/**
	 * 	Update Ip65504P569ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P569-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P569ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P569ReservdS = checkIp65504P569ReservdSMaxLimit(number); 
		serializeIp65504P569ReservdS(ip65504P569ReservdS);
	}

	public void setIp65504P569ReservdS(int number) {
	    number = checkIp65504P569ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P569ReservdS((short)number);
	}
	public void setIp65504P569ReservdS(long number) {
	    number = checkIp65504P569ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P569ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P569ReservdL
	 *	@return ip65504P569ReservdL
	 */
	public short getIp65504P569ReservdL() throws CFException {
        if (isIp65504P569ReservdLModified()) { 
           ip65504P569ReservdL = refreshIp65504P569ReservdL();
        }
   		return ip65504P569ReservdL;
	}
	
	/**
	 * 	Update Ip65504P569ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P569-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P569ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P569ReservdL = checkIp65504P569ReservdLMaxLimit(number); 
		serializeIp65504P569ReservdL(ip65504P569ReservdL);
	}

	public void setIp65504P569ReservdL(int number) {
	    number = checkIp65504P569ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P569ReservdL((short)number);
	}
	public void setIp65504P569ReservdL(long number) {
	    number = checkIp65504P569ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P569ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P570ReservdS
	 *	@return ip65504P570ReservdS
	 */
	public short getIp65504P570ReservdS() throws CFException {
        if (isIp65504P570ReservdSModified()) { 
           ip65504P570ReservdS = refreshIp65504P570ReservdS();
        }
   		return ip65504P570ReservdS;
	}
	
	/**
	 * 	Update Ip65504P570ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P570-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P570ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P570ReservdS = checkIp65504P570ReservdSMaxLimit(number); 
		serializeIp65504P570ReservdS(ip65504P570ReservdS);
	}

	public void setIp65504P570ReservdS(int number) {
	    number = checkIp65504P570ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P570ReservdS((short)number);
	}
	public void setIp65504P570ReservdS(long number) {
	    number = checkIp65504P570ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P570ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P570ReservdL
	 *	@return ip65504P570ReservdL
	 */
	public short getIp65504P570ReservdL() throws CFException {
        if (isIp65504P570ReservdLModified()) { 
           ip65504P570ReservdL = refreshIp65504P570ReservdL();
        }
   		return ip65504P570ReservdL;
	}
	
	/**
	 * 	Update Ip65504P570ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P570-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P570ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P570ReservdL = checkIp65504P570ReservdLMaxLimit(number); 
		serializeIp65504P570ReservdL(ip65504P570ReservdL);
	}

	public void setIp65504P570ReservdL(int number) {
	    number = checkIp65504P570ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P570ReservdL((short)number);
	}
	public void setIp65504P570ReservdL(long number) {
	    number = checkIp65504P570ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P570ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P571ReservdS
	 *	@return ip65504P571ReservdS
	 */
	public short getIp65504P571ReservdS() throws CFException {
        if (isIp65504P571ReservdSModified()) { 
           ip65504P571ReservdS = refreshIp65504P571ReservdS();
        }
   		return ip65504P571ReservdS;
	}
	
	/**
	 * 	Update Ip65504P571ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P571-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P571ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P571ReservdS = checkIp65504P571ReservdSMaxLimit(number); 
		serializeIp65504P571ReservdS(ip65504P571ReservdS);
	}

	public void setIp65504P571ReservdS(int number) {
	    number = checkIp65504P571ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P571ReservdS((short)number);
	}
	public void setIp65504P571ReservdS(long number) {
	    number = checkIp65504P571ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P571ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P571ReservdL
	 *	@return ip65504P571ReservdL
	 */
	public short getIp65504P571ReservdL() throws CFException {
        if (isIp65504P571ReservdLModified()) { 
           ip65504P571ReservdL = refreshIp65504P571ReservdL();
        }
   		return ip65504P571ReservdL;
	}
	
	/**
	 * 	Update Ip65504P571ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P571-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P571ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P571ReservdL = checkIp65504P571ReservdLMaxLimit(number); 
		serializeIp65504P571ReservdL(ip65504P571ReservdL);
	}

	public void setIp65504P571ReservdL(int number) {
	    number = checkIp65504P571ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P571ReservdL((short)number);
	}
	public void setIp65504P571ReservdL(long number) {
	    number = checkIp65504P571ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P571ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P572ReservdS
	 *	@return ip65504P572ReservdS
	 */
	public short getIp65504P572ReservdS() throws CFException {
        if (isIp65504P572ReservdSModified()) { 
           ip65504P572ReservdS = refreshIp65504P572ReservdS();
        }
   		return ip65504P572ReservdS;
	}
	
	/**
	 * 	Update Ip65504P572ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P572-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P572ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P572ReservdS = checkIp65504P572ReservdSMaxLimit(number); 
		serializeIp65504P572ReservdS(ip65504P572ReservdS);
	}

	public void setIp65504P572ReservdS(int number) {
	    number = checkIp65504P572ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P572ReservdS((short)number);
	}
	public void setIp65504P572ReservdS(long number) {
	    number = checkIp65504P572ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P572ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P572ReservdL
	 *	@return ip65504P572ReservdL
	 */
	public short getIp65504P572ReservdL() throws CFException {
        if (isIp65504P572ReservdLModified()) { 
           ip65504P572ReservdL = refreshIp65504P572ReservdL();
        }
   		return ip65504P572ReservdL;
	}
	
	/**
	 * 	Update Ip65504P572ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P572-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P572ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P572ReservdL = checkIp65504P572ReservdLMaxLimit(number); 
		serializeIp65504P572ReservdL(ip65504P572ReservdL);
	}

	public void setIp65504P572ReservdL(int number) {
	    number = checkIp65504P572ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P572ReservdL((short)number);
	}
	public void setIp65504P572ReservdL(long number) {
	    number = checkIp65504P572ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P572ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P573ReservdS
	 *	@return ip65504P573ReservdS
	 */
	public short getIp65504P573ReservdS() throws CFException {
        if (isIp65504P573ReservdSModified()) { 
           ip65504P573ReservdS = refreshIp65504P573ReservdS();
        }
   		return ip65504P573ReservdS;
	}
	
	/**
	 * 	Update Ip65504P573ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P573-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P573ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P573ReservdS = checkIp65504P573ReservdSMaxLimit(number); 
		serializeIp65504P573ReservdS(ip65504P573ReservdS);
	}

	public void setIp65504P573ReservdS(int number) {
	    number = checkIp65504P573ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P573ReservdS((short)number);
	}
	public void setIp65504P573ReservdS(long number) {
	    number = checkIp65504P573ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P573ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P573ReservdL
	 *	@return ip65504P573ReservdL
	 */
	public short getIp65504P573ReservdL() throws CFException {
        if (isIp65504P573ReservdLModified()) { 
           ip65504P573ReservdL = refreshIp65504P573ReservdL();
        }
   		return ip65504P573ReservdL;
	}
	
	/**
	 * 	Update Ip65504P573ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P573-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P573ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P573ReservdL = checkIp65504P573ReservdLMaxLimit(number); 
		serializeIp65504P573ReservdL(ip65504P573ReservdL);
	}

	public void setIp65504P573ReservdL(int number) {
	    number = checkIp65504P573ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P573ReservdL((short)number);
	}
	public void setIp65504P573ReservdL(long number) {
	    number = checkIp65504P573ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P573ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P574ArvDteS
	 *	@return ip65504P574ArvDteS
	 */
	public short getIp65504P574ArvDteS() throws CFException {
        if (isIp65504P574ArvDteSModified()) { 
           ip65504P574ArvDteS = refreshIp65504P574ArvDteS();
        }
   		return ip65504P574ArvDteS;
	}
	
	/**
	 * 	Update Ip65504P574ArvDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P574-ARV-DTE-S
	 *	@param number
	 */
	public void setIp65504P574ArvDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P574ArvDteS = checkIp65504P574ArvDteSMaxLimit(number); 
		serializeIp65504P574ArvDteS(ip65504P574ArvDteS);
	}

	public void setIp65504P574ArvDteS(int number) {
	    number = checkIp65504P574ArvDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P574ArvDteS((short)number);
	}
	public void setIp65504P574ArvDteS(long number) {
	    number = checkIp65504P574ArvDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P574ArvDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P574ArvDteL
	 *	@return ip65504P574ArvDteL
	 */
	public short getIp65504P574ArvDteL() throws CFException {
        if (isIp65504P574ArvDteLModified()) { 
           ip65504P574ArvDteL = refreshIp65504P574ArvDteL();
        }
   		return ip65504P574ArvDteL;
	}
	
	/**
	 * 	Update Ip65504P574ArvDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P574-ARV-DTE-L
	 *	@param number
	 */
	public void setIp65504P574ArvDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P574ArvDteL = checkIp65504P574ArvDteLMaxLimit(number); 
		serializeIp65504P574ArvDteL(ip65504P574ArvDteL);
	}

	public void setIp65504P574ArvDteL(int number) {
	    number = checkIp65504P574ArvDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P574ArvDteL((short)number);
	}
	public void setIp65504P574ArvDteL(long number) {
	    number = checkIp65504P574ArvDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P574ArvDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P575DepDteS
	 *	@return ip65504P575DepDteS
	 */
	public short getIp65504P575DepDteS() throws CFException {
        if (isIp65504P575DepDteSModified()) { 
           ip65504P575DepDteS = refreshIp65504P575DepDteS();
        }
   		return ip65504P575DepDteS;
	}
	
	/**
	 * 	Update Ip65504P575DepDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P575-DEP-DTE-S
	 *	@param number
	 */
	public void setIp65504P575DepDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P575DepDteS = checkIp65504P575DepDteSMaxLimit(number); 
		serializeIp65504P575DepDteS(ip65504P575DepDteS);
	}

	public void setIp65504P575DepDteS(int number) {
	    number = checkIp65504P575DepDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P575DepDteS((short)number);
	}
	public void setIp65504P575DepDteS(long number) {
	    number = checkIp65504P575DepDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P575DepDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P575DepDteL
	 *	@return ip65504P575DepDteL
	 */
	public short getIp65504P575DepDteL() throws CFException {
        if (isIp65504P575DepDteLModified()) { 
           ip65504P575DepDteL = refreshIp65504P575DepDteL();
        }
   		return ip65504P575DepDteL;
	}
	
	/**
	 * 	Update Ip65504P575DepDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P575-DEP-DTE-L
	 *	@param number
	 */
	public void setIp65504P575DepDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P575DepDteL = checkIp65504P575DepDteLMaxLimit(number); 
		serializeIp65504P575DepDteL(ip65504P575DepDteL);
	}

	public void setIp65504P575DepDteL(int number) {
	    number = checkIp65504P575DepDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P575DepDteL((short)number);
	}
	public void setIp65504P575DepDteL(long number) {
	    number = checkIp65504P575DepDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P575DepDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P576FolioNS
	 *	@return ip65504P576FolioNS
	 */
	public short getIp65504P576FolioNS() throws CFException {
        if (isIp65504P576FolioNSModified()) { 
           ip65504P576FolioNS = refreshIp65504P576FolioNS();
        }
   		return ip65504P576FolioNS;
	}
	
	/**
	 * 	Update Ip65504P576FolioNS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P576-FOLIO-N-S
	 *	@param number
	 */
	public void setIp65504P576FolioNS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P576FolioNS = checkIp65504P576FolioNSMaxLimit(number); 
		serializeIp65504P576FolioNS(ip65504P576FolioNS);
	}

	public void setIp65504P576FolioNS(int number) {
	    number = checkIp65504P576FolioNSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P576FolioNS((short)number);
	}
	public void setIp65504P576FolioNS(long number) {
	    number = checkIp65504P576FolioNSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P576FolioNS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P576FolioNL
	 *	@return ip65504P576FolioNL
	 */
	public short getIp65504P576FolioNL() throws CFException {
        if (isIp65504P576FolioNLModified()) { 
           ip65504P576FolioNL = refreshIp65504P576FolioNL();
        }
   		return ip65504P576FolioNL;
	}
	
	/**
	 * 	Update Ip65504P576FolioNL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P576-FOLIO-N-L
	 *	@param number
	 */
	public void setIp65504P576FolioNL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P576FolioNL = checkIp65504P576FolioNLMaxLimit(number); 
		serializeIp65504P576FolioNL(ip65504P576FolioNL);
	}

	public void setIp65504P576FolioNL(int number) {
	    number = checkIp65504P576FolioNLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P576FolioNL((short)number);
	}
	public void setIp65504P576FolioNL(long number) {
	    number = checkIp65504P576FolioNLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P576FolioNL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P577PrpTelS
	 *	@return ip65504P577PrpTelS
	 */
	public short getIp65504P577PrpTelS() throws CFException {
        if (isIp65504P577PrpTelSModified()) { 
           ip65504P577PrpTelS = refreshIp65504P577PrpTelS();
        }
   		return ip65504P577PrpTelS;
	}
	
	/**
	 * 	Update Ip65504P577PrpTelS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P577-PRP-TEL-S
	 *	@param number
	 */
	public void setIp65504P577PrpTelS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P577PrpTelS = checkIp65504P577PrpTelSMaxLimit(number); 
		serializeIp65504P577PrpTelS(ip65504P577PrpTelS);
	}

	public void setIp65504P577PrpTelS(int number) {
	    number = checkIp65504P577PrpTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P577PrpTelS((short)number);
	}
	public void setIp65504P577PrpTelS(long number) {
	    number = checkIp65504P577PrpTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P577PrpTelS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P577PrpTelL
	 *	@return ip65504P577PrpTelL
	 */
	public short getIp65504P577PrpTelL() throws CFException {
        if (isIp65504P577PrpTelLModified()) { 
           ip65504P577PrpTelL = refreshIp65504P577PrpTelL();
        }
   		return ip65504P577PrpTelL;
	}
	
	/**
	 * 	Update Ip65504P577PrpTelL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P577-PRP-TEL-L
	 *	@param number
	 */
	public void setIp65504P577PrpTelL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P577PrpTelL = checkIp65504P577PrpTelLMaxLimit(number); 
		serializeIp65504P577PrpTelL(ip65504P577PrpTelL);
	}

	public void setIp65504P577PrpTelL(int number) {
	    number = checkIp65504P577PrpTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P577PrpTelL((short)number);
	}
	public void setIp65504P577PrpTelL(long number) {
	    number = checkIp65504P577PrpTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P577PrpTelL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P578BilAdjS
	 *	@return ip65504P578BilAdjS
	 */
	public short getIp65504P578BilAdjS() throws CFException {
        if (isIp65504P578BilAdjSModified()) { 
           ip65504P578BilAdjS = refreshIp65504P578BilAdjS();
        }
   		return ip65504P578BilAdjS;
	}
	
	/**
	 * 	Update Ip65504P578BilAdjS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P578-BIL-ADJ-S
	 *	@param number
	 */
	public void setIp65504P578BilAdjS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P578BilAdjS = checkIp65504P578BilAdjSMaxLimit(number); 
		serializeIp65504P578BilAdjS(ip65504P578BilAdjS);
	}

	public void setIp65504P578BilAdjS(int number) {
	    number = checkIp65504P578BilAdjSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P578BilAdjS((short)number);
	}
	public void setIp65504P578BilAdjS(long number) {
	    number = checkIp65504P578BilAdjSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P578BilAdjS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P578BilAdjL
	 *	@return ip65504P578BilAdjL
	 */
	public short getIp65504P578BilAdjL() throws CFException {
        if (isIp65504P578BilAdjLModified()) { 
           ip65504P578BilAdjL = refreshIp65504P578BilAdjL();
        }
   		return ip65504P578BilAdjL;
	}
	
	/**
	 * 	Update Ip65504P578BilAdjL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P578-BIL-ADJ-L
	 *	@param number
	 */
	public void setIp65504P578BilAdjL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P578BilAdjL = checkIp65504P578BilAdjLMaxLimit(number); 
		serializeIp65504P578BilAdjL(ip65504P578BilAdjL);
	}

	public void setIp65504P578BilAdjL(int number) {
	    number = checkIp65504P578BilAdjLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P578BilAdjL((short)number);
	}
	public void setIp65504P578BilAdjL(long number) {
	    number = checkIp65504P578BilAdjLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P578BilAdjL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P579ReservdS
	 *	@return ip65504P579ReservdS
	 */
	public short getIp65504P579ReservdS() throws CFException {
        if (isIp65504P579ReservdSModified()) { 
           ip65504P579ReservdS = refreshIp65504P579ReservdS();
        }
   		return ip65504P579ReservdS;
	}
	
	/**
	 * 	Update Ip65504P579ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P579-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P579ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P579ReservdS = checkIp65504P579ReservdSMaxLimit(number); 
		serializeIp65504P579ReservdS(ip65504P579ReservdS);
	}

	public void setIp65504P579ReservdS(int number) {
	    number = checkIp65504P579ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P579ReservdS((short)number);
	}
	public void setIp65504P579ReservdS(long number) {
	    number = checkIp65504P579ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P579ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P579ReservdL
	 *	@return ip65504P579ReservdL
	 */
	public short getIp65504P579ReservdL() throws CFException {
        if (isIp65504P579ReservdLModified()) { 
           ip65504P579ReservdL = refreshIp65504P579ReservdL();
        }
   		return ip65504P579ReservdL;
	}
	
	/**
	 * 	Update Ip65504P579ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P579-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P579ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P579ReservdL = checkIp65504P579ReservdLMaxLimit(number); 
		serializeIp65504P579ReservdL(ip65504P579ReservdL);
	}

	public void setIp65504P579ReservdL(int number) {
	    number = checkIp65504P579ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P579ReservdL((short)number);
	}
	public void setIp65504P579ReservdL(long number) {
	    number = checkIp65504P579ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P579ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P580RoomRtS
	 *	@return ip65504P580RoomRtS
	 */
	public short getIp65504P580RoomRtS() throws CFException {
        if (isIp65504P580RoomRtSModified()) { 
           ip65504P580RoomRtS = refreshIp65504P580RoomRtS();
        }
   		return ip65504P580RoomRtS;
	}
	
	/**
	 * 	Update Ip65504P580RoomRtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P580-ROOM-RT-S
	 *	@param number
	 */
	public void setIp65504P580RoomRtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P580RoomRtS = checkIp65504P580RoomRtSMaxLimit(number); 
		serializeIp65504P580RoomRtS(ip65504P580RoomRtS);
	}

	public void setIp65504P580RoomRtS(int number) {
	    number = checkIp65504P580RoomRtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P580RoomRtS((short)number);
	}
	public void setIp65504P580RoomRtS(long number) {
	    number = checkIp65504P580RoomRtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P580RoomRtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P580RoomRtL
	 *	@return ip65504P580RoomRtL
	 */
	public short getIp65504P580RoomRtL() throws CFException {
        if (isIp65504P580RoomRtLModified()) { 
           ip65504P580RoomRtL = refreshIp65504P580RoomRtL();
        }
   		return ip65504P580RoomRtL;
	}
	
	/**
	 * 	Update Ip65504P580RoomRtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P580-ROOM-RT-L
	 *	@param number
	 */
	public void setIp65504P580RoomRtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P580RoomRtL = checkIp65504P580RoomRtLMaxLimit(number); 
		serializeIp65504P580RoomRtL(ip65504P580RoomRtL);
	}

	public void setIp65504P580RoomRtL(int number) {
	    number = checkIp65504P580RoomRtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P580RoomRtL((short)number);
	}
	public void setIp65504P580RoomRtL(long number) {
	    number = checkIp65504P580RoomRtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P580RoomRtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P581RoomTxS
	 *	@return ip65504P581RoomTxS
	 */
	public short getIp65504P581RoomTxS() throws CFException {
        if (isIp65504P581RoomTxSModified()) { 
           ip65504P581RoomTxS = refreshIp65504P581RoomTxS();
        }
   		return ip65504P581RoomTxS;
	}
	
	/**
	 * 	Update Ip65504P581RoomTxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P581-ROOM-TX-S
	 *	@param number
	 */
	public void setIp65504P581RoomTxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P581RoomTxS = checkIp65504P581RoomTxSMaxLimit(number); 
		serializeIp65504P581RoomTxS(ip65504P581RoomTxS);
	}

	public void setIp65504P581RoomTxS(int number) {
	    number = checkIp65504P581RoomTxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P581RoomTxS((short)number);
	}
	public void setIp65504P581RoomTxS(long number) {
	    number = checkIp65504P581RoomTxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P581RoomTxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P581RoomTxL
	 *	@return ip65504P581RoomTxL
	 */
	public short getIp65504P581RoomTxL() throws CFException {
        if (isIp65504P581RoomTxLModified()) { 
           ip65504P581RoomTxL = refreshIp65504P581RoomTxL();
        }
   		return ip65504P581RoomTxL;
	}
	
	/**
	 * 	Update Ip65504P581RoomTxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P581-ROOM-TX-L
	 *	@param number
	 */
	public void setIp65504P581RoomTxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P581RoomTxL = checkIp65504P581RoomTxLMaxLimit(number); 
		serializeIp65504P581RoomTxL(ip65504P581RoomTxL);
	}

	public void setIp65504P581RoomTxL(int number) {
	    number = checkIp65504P581RoomTxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P581RoomTxL((short)number);
	}
	public void setIp65504P581RoomTxL(long number) {
	    number = checkIp65504P581RoomTxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P581RoomTxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P582PgmCodS
	 *	@return ip65504P582PgmCodS
	 */
	public short getIp65504P582PgmCodS() throws CFException {
        if (isIp65504P582PgmCodSModified()) { 
           ip65504P582PgmCodS = refreshIp65504P582PgmCodS();
        }
   		return ip65504P582PgmCodS;
	}
	
	/**
	 * 	Update Ip65504P582PgmCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P582-PGM-COD-S
	 *	@param number
	 */
	public void setIp65504P582PgmCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P582PgmCodS = checkIp65504P582PgmCodSMaxLimit(number); 
		serializeIp65504P582PgmCodS(ip65504P582PgmCodS);
	}

	public void setIp65504P582PgmCodS(int number) {
	    number = checkIp65504P582PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P582PgmCodS((short)number);
	}
	public void setIp65504P582PgmCodS(long number) {
	    number = checkIp65504P582PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P582PgmCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P582PgmCodL
	 *	@return ip65504P582PgmCodL
	 */
	public short getIp65504P582PgmCodL() throws CFException {
        if (isIp65504P582PgmCodLModified()) { 
           ip65504P582PgmCodL = refreshIp65504P582PgmCodL();
        }
   		return ip65504P582PgmCodL;
	}
	
	/**
	 * 	Update Ip65504P582PgmCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P582-PGM-COD-L
	 *	@param number
	 */
	public void setIp65504P582PgmCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P582PgmCodL = checkIp65504P582PgmCodLMaxLimit(number); 
		serializeIp65504P582PgmCodL(ip65504P582PgmCodL);
	}

	public void setIp65504P582PgmCodL(int number) {
	    number = checkIp65504P582PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P582PgmCodL((short)number);
	}
	public void setIp65504P582PgmCodL(long number) {
	    number = checkIp65504P582PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P582PgmCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P583TelChgS
	 *	@return ip65504P583TelChgS
	 */
	public short getIp65504P583TelChgS() throws CFException {
        if (isIp65504P583TelChgSModified()) { 
           ip65504P583TelChgS = refreshIp65504P583TelChgS();
        }
   		return ip65504P583TelChgS;
	}
	
	/**
	 * 	Update Ip65504P583TelChgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P583-TEL-CHG-S
	 *	@param number
	 */
	public void setIp65504P583TelChgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P583TelChgS = checkIp65504P583TelChgSMaxLimit(number); 
		serializeIp65504P583TelChgS(ip65504P583TelChgS);
	}

	public void setIp65504P583TelChgS(int number) {
	    number = checkIp65504P583TelChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P583TelChgS((short)number);
	}
	public void setIp65504P583TelChgS(long number) {
	    number = checkIp65504P583TelChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P583TelChgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P583TelChgL
	 *	@return ip65504P583TelChgL
	 */
	public short getIp65504P583TelChgL() throws CFException {
        if (isIp65504P583TelChgLModified()) { 
           ip65504P583TelChgL = refreshIp65504P583TelChgL();
        }
   		return ip65504P583TelChgL;
	}
	
	/**
	 * 	Update Ip65504P583TelChgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P583-TEL-CHG-L
	 *	@param number
	 */
	public void setIp65504P583TelChgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P583TelChgL = checkIp65504P583TelChgLMaxLimit(number); 
		serializeIp65504P583TelChgL(ip65504P583TelChgL);
	}

	public void setIp65504P583TelChgL(int number) {
	    number = checkIp65504P583TelChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P583TelChgL((short)number);
	}
	public void setIp65504P583TelChgL(long number) {
	    number = checkIp65504P583TelChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P583TelChgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P584RstChgS
	 *	@return ip65504P584RstChgS
	 */
	public short getIp65504P584RstChgS() throws CFException {
        if (isIp65504P584RstChgSModified()) { 
           ip65504P584RstChgS = refreshIp65504P584RstChgS();
        }
   		return ip65504P584RstChgS;
	}
	
	/**
	 * 	Update Ip65504P584RstChgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P584-RST-CHG-S
	 *	@param number
	 */
	public void setIp65504P584RstChgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P584RstChgS = checkIp65504P584RstChgSMaxLimit(number); 
		serializeIp65504P584RstChgS(ip65504P584RstChgS);
	}

	public void setIp65504P584RstChgS(int number) {
	    number = checkIp65504P584RstChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P584RstChgS((short)number);
	}
	public void setIp65504P584RstChgS(long number) {
	    number = checkIp65504P584RstChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P584RstChgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P584RstChgL
	 *	@return ip65504P584RstChgL
	 */
	public short getIp65504P584RstChgL() throws CFException {
        if (isIp65504P584RstChgLModified()) { 
           ip65504P584RstChgL = refreshIp65504P584RstChgL();
        }
   		return ip65504P584RstChgL;
	}
	
	/**
	 * 	Update Ip65504P584RstChgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P584-RST-CHG-L
	 *	@param number
	 */
	public void setIp65504P584RstChgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P584RstChgL = checkIp65504P584RstChgLMaxLimit(number); 
		serializeIp65504P584RstChgL(ip65504P584RstChgL);
	}

	public void setIp65504P584RstChgL(int number) {
	    number = checkIp65504P584RstChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P584RstChgL((short)number);
	}
	public void setIp65504P584RstChgL(long number) {
	    number = checkIp65504P584RstChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P584RstChgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P585BarChgS
	 *	@return ip65504P585BarChgS
	 */
	public short getIp65504P585BarChgS() throws CFException {
        if (isIp65504P585BarChgSModified()) { 
           ip65504P585BarChgS = refreshIp65504P585BarChgS();
        }
   		return ip65504P585BarChgS;
	}
	
	/**
	 * 	Update Ip65504P585BarChgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P585-BAR-CHG-S
	 *	@param number
	 */
	public void setIp65504P585BarChgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P585BarChgS = checkIp65504P585BarChgSMaxLimit(number); 
		serializeIp65504P585BarChgS(ip65504P585BarChgS);
	}

	public void setIp65504P585BarChgS(int number) {
	    number = checkIp65504P585BarChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P585BarChgS((short)number);
	}
	public void setIp65504P585BarChgS(long number) {
	    number = checkIp65504P585BarChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P585BarChgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P585BarChgL
	 *	@return ip65504P585BarChgL
	 */
	public short getIp65504P585BarChgL() throws CFException {
        if (isIp65504P585BarChgLModified()) { 
           ip65504P585BarChgL = refreshIp65504P585BarChgL();
        }
   		return ip65504P585BarChgL;
	}
	
	/**
	 * 	Update Ip65504P585BarChgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P585-BAR-CHG-L
	 *	@param number
	 */
	public void setIp65504P585BarChgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P585BarChgL = checkIp65504P585BarChgLMaxLimit(number); 
		serializeIp65504P585BarChgL(ip65504P585BarChgL);
	}

	public void setIp65504P585BarChgL(int number) {
	    number = checkIp65504P585BarChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P585BarChgL((short)number);
	}
	public void setIp65504P585BarChgL(long number) {
	    number = checkIp65504P585BarChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P585BarChgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P586GifChgS
	 *	@return ip65504P586GifChgS
	 */
	public short getIp65504P586GifChgS() throws CFException {
        if (isIp65504P586GifChgSModified()) { 
           ip65504P586GifChgS = refreshIp65504P586GifChgS();
        }
   		return ip65504P586GifChgS;
	}
	
	/**
	 * 	Update Ip65504P586GifChgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P586-GIF-CHG-S
	 *	@param number
	 */
	public void setIp65504P586GifChgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P586GifChgS = checkIp65504P586GifChgSMaxLimit(number); 
		serializeIp65504P586GifChgS(ip65504P586GifChgS);
	}

	public void setIp65504P586GifChgS(int number) {
	    number = checkIp65504P586GifChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P586GifChgS((short)number);
	}
	public void setIp65504P586GifChgS(long number) {
	    number = checkIp65504P586GifChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P586GifChgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P586GifChgL
	 *	@return ip65504P586GifChgL
	 */
	public short getIp65504P586GifChgL() throws CFException {
        if (isIp65504P586GifChgLModified()) { 
           ip65504P586GifChgL = refreshIp65504P586GifChgL();
        }
   		return ip65504P586GifChgL;
	}
	
	/**
	 * 	Update Ip65504P586GifChgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P586-GIF-CHG-L
	 *	@param number
	 */
	public void setIp65504P586GifChgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P586GifChgL = checkIp65504P586GifChgLMaxLimit(number); 
		serializeIp65504P586GifChgL(ip65504P586GifChgL);
	}

	public void setIp65504P586GifChgL(int number) {
	    number = checkIp65504P586GifChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P586GifChgL((short)number);
	}
	public void setIp65504P586GifChgL(long number) {
	    number = checkIp65504P586GifChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P586GifChgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P587LauChgS
	 *	@return ip65504P587LauChgS
	 */
	public short getIp65504P587LauChgS() throws CFException {
        if (isIp65504P587LauChgSModified()) { 
           ip65504P587LauChgS = refreshIp65504P587LauChgS();
        }
   		return ip65504P587LauChgS;
	}
	
	/**
	 * 	Update Ip65504P587LauChgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P587-LAU-CHG-S
	 *	@param number
	 */
	public void setIp65504P587LauChgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P587LauChgS = checkIp65504P587LauChgSMaxLimit(number); 
		serializeIp65504P587LauChgS(ip65504P587LauChgS);
	}

	public void setIp65504P587LauChgS(int number) {
	    number = checkIp65504P587LauChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P587LauChgS((short)number);
	}
	public void setIp65504P587LauChgS(long number) {
	    number = checkIp65504P587LauChgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P587LauChgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P587LauChgL
	 *	@return ip65504P587LauChgL
	 */
	public short getIp65504P587LauChgL() throws CFException {
        if (isIp65504P587LauChgLModified()) { 
           ip65504P587LauChgL = refreshIp65504P587LauChgL();
        }
   		return ip65504P587LauChgL;
	}
	
	/**
	 * 	Update Ip65504P587LauChgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P587-LAU-CHG-L
	 *	@param number
	 */
	public void setIp65504P587LauChgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P587LauChgL = checkIp65504P587LauChgLMaxLimit(number); 
		serializeIp65504P587LauChgL(ip65504P587LauChgL);
	}

	public void setIp65504P587LauChgL(int number) {
	    number = checkIp65504P587LauChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P587LauChgL((short)number);
	}
	public void setIp65504P587LauChgL(long number) {
	    number = checkIp65504P587LauChgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P587LauChgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P588OthSvcS
	 *	@return ip65504P588OthSvcS
	 */
	public short getIp65504P588OthSvcS() throws CFException {
        if (isIp65504P588OthSvcSModified()) { 
           ip65504P588OthSvcS = refreshIp65504P588OthSvcS();
        }
   		return ip65504P588OthSvcS;
	}
	
	/**
	 * 	Update Ip65504P588OthSvcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P588-OTH-SVC-S
	 *	@param number
	 */
	public void setIp65504P588OthSvcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P588OthSvcS = checkIp65504P588OthSvcSMaxLimit(number); 
		serializeIp65504P588OthSvcS(ip65504P588OthSvcS);
	}

	public void setIp65504P588OthSvcS(int number) {
	    number = checkIp65504P588OthSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P588OthSvcS((short)number);
	}
	public void setIp65504P588OthSvcS(long number) {
	    number = checkIp65504P588OthSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P588OthSvcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P588OthSvcL
	 *	@return ip65504P588OthSvcL
	 */
	public short getIp65504P588OthSvcL() throws CFException {
        if (isIp65504P588OthSvcLModified()) { 
           ip65504P588OthSvcL = refreshIp65504P588OthSvcL();
        }
   		return ip65504P588OthSvcL;
	}
	
	/**
	 * 	Update Ip65504P588OthSvcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P588-OTH-SVC-L
	 *	@param number
	 */
	public void setIp65504P588OthSvcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P588OthSvcL = checkIp65504P588OthSvcLMaxLimit(number); 
		serializeIp65504P588OthSvcL(ip65504P588OthSvcL);
	}

	public void setIp65504P588OthSvcL(int number) {
	    number = checkIp65504P588OthSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P588OthSvcL((short)number);
	}
	public void setIp65504P588OthSvcL(long number) {
	    number = checkIp65504P588OthSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P588OthSvcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P589ReservdS
	 *	@return ip65504P589ReservdS
	 */
	public short getIp65504P589ReservdS() throws CFException {
        if (isIp65504P589ReservdSModified()) { 
           ip65504P589ReservdS = refreshIp65504P589ReservdS();
        }
   		return ip65504P589ReservdS;
	}
	
	/**
	 * 	Update Ip65504P589ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P589-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P589ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P589ReservdS = checkIp65504P589ReservdSMaxLimit(number); 
		serializeIp65504P589ReservdS(ip65504P589ReservdS);
	}

	public void setIp65504P589ReservdS(int number) {
	    number = checkIp65504P589ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P589ReservdS((short)number);
	}
	public void setIp65504P589ReservdS(long number) {
	    number = checkIp65504P589ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P589ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P589ReservdL
	 *	@return ip65504P589ReservdL
	 */
	public short getIp65504P589ReservdL() throws CFException {
        if (isIp65504P589ReservdLModified()) { 
           ip65504P589ReservdL = refreshIp65504P589ReservdL();
        }
   		return ip65504P589ReservdL;
	}
	
	/**
	 * 	Update Ip65504P589ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P589-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P589ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P589ReservdL = checkIp65504P589ReservdLMaxLimit(number); 
		serializeIp65504P589ReservdL(ip65504P589ReservdL);
	}

	public void setIp65504P589ReservdL(int number) {
	    number = checkIp65504P589ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P589ReservdL((short)number);
	}
	public void setIp65504P589ReservdL(long number) {
	    number = checkIp65504P589ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P589ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P559VehInsS((short)0);
         	setIp65504P559VehInsL((short)0);
         	setIp65504P560ReservdS((short)0);
         	setIp65504P560ReservdL((short)0);
         	setIp65504P561AdjAmtS((short)0);
         	setIp65504P561AdjAmtL((short)0);
         	setIp65504P562ReservdS((short)0);
         	setIp65504P562ReservdL((short)0);
         	setIp65504P563PgmCodS((short)0);
         	setIp65504P563PgmCodL((short)0);
         	setIp65504P564RntcityS((short)0);
         	setIp65504P564RntcityL((short)0);
         	setIp65504P565RentStS((short)0);
         	setIp65504P565RentStL((short)0);
         	setIp65504P566RntctryS((short)0);
         	setIp65504P566RntctryL((short)0);
         	setIp65504P567RntLocS((short)0);
         	setIp65504P567RntLocL((short)0);
         	setIp65504P568RntClsS((short)0);
         	setIp65504P568RntClsL((short)0);
         	setIp65504P569ReservdS((short)0);
         	setIp65504P569ReservdL((short)0);
         	setIp65504P570ReservdS((short)0);
         	setIp65504P570ReservdL((short)0);
         	setIp65504P571ReservdS((short)0);
         	setIp65504P571ReservdL((short)0);
         	setIp65504P572ReservdS((short)0);
         	setIp65504P572ReservdL((short)0);
         	setIp65504P573ReservdS((short)0);
         	setIp65504P573ReservdL((short)0);
         	setIp65504P574ArvDteS((short)0);
         	setIp65504P574ArvDteL((short)0);
         	setIp65504P575DepDteS((short)0);
         	setIp65504P575DepDteL((short)0);
         	setIp65504P576FolioNS((short)0);
         	setIp65504P576FolioNL((short)0);
         	setIp65504P577PrpTelS((short)0);
         	setIp65504P577PrpTelL((short)0);
         	setIp65504P578BilAdjS((short)0);
         	setIp65504P578BilAdjL((short)0);
         	setIp65504P579ReservdS((short)0);
         	setIp65504P579ReservdL((short)0);
         	setIp65504P580RoomRtS((short)0);
         	setIp65504P580RoomRtL((short)0);
         	setIp65504P581RoomTxS((short)0);
         	setIp65504P581RoomTxL((short)0);
         	setIp65504P582PgmCodS((short)0);
         	setIp65504P582PgmCodL((short)0);
         	setIp65504P583TelChgS((short)0);
         	setIp65504P583TelChgL((short)0);
         	setIp65504P584RstChgS((short)0);
         	setIp65504P584RstChgL((short)0);
         	setIp65504P585BarChgS((short)0);
         	setIp65504P585BarChgL((short)0);
         	setIp65504P586GifChgS((short)0);
         	setIp65504P586GifChgL((short)0);
         	setIp65504P587LauChgS((short)0);
         	setIp65504P587LauChgL((short)0);
         	setIp65504P588OthSvcS((short)0);
         	setIp65504P588OthSvcL((short)0);
         	setIp65504P589ReservdS((short)0);
         	setIp65504P589ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup19FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_19_LENGTH;
		}

}
  
