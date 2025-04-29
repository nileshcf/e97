package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup53Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup53Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup53Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_53_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1613S;
            protected  int beginIp65504P1613L;
            protected  int beginIp65504P1614S;
            protected  int beginIp65504P1614L;
            protected  int beginIp65504P1615S;
            protected  int beginIp65504P1615L;
            protected  int beginIp65504P1616S;
            protected  int beginIp65504P1616L;
            protected  int beginIp65504P1617S;
            protected  int beginIp65504P1617L;
            protected  int beginIp65504P1618S;
            protected  int beginIp65504P1618L;
            protected  int beginIp65504P1619S;
            protected  int beginIp65504P1619L;
            protected  int beginIp65504P1620S;
            protected  int beginIp65504P1620L;
            protected  int beginIp65504P1621S;
            protected  int beginIp65504P1621L;
            protected  int beginIp65504P1622S;
            protected  int beginIp65504P1622L;
            protected  int beginIp65504P1623S;
            protected  int beginIp65504P1623L;
            protected  int beginIp65504P1624S;
            protected  int beginIp65504P1624L;
            protected  int beginIp65504P1625S;
            protected  int beginIp65504P1625L;
            protected  int beginIp65504P1626S;
            protected  int beginIp65504P1626L;
            protected  int beginIp65504P1627S;
            protected  int beginIp65504P1627L;
            protected  int beginIp65504P1628S;
            protected  int beginIp65504P1628L;
            protected  int beginIp65504P1629S;
            protected  int beginIp65504P1629L;
            protected  int beginIp65504P1630S;
            protected  int beginIp65504P1630L;
            protected  int beginIp65504P1631S;
            protected  int beginIp65504P1631L;
            protected  int beginIp65504P1632S;
            protected  int beginIp65504P1632L;
            protected  int beginIp65504P1633S;
            protected  int beginIp65504P1633L;
            protected  int beginIp65504P1634S;
            protected  int beginIp65504P1634L;
            protected  int beginIp65504P1635S;
            protected  int beginIp65504P1635L;
            protected  int beginIp65504P1636S;
            protected  int beginIp65504P1636L;
            protected  int beginIp65504P1637S;
            protected  int beginIp65504P1637L;
            protected  int beginIp65504P1638S;
            protected  int beginIp65504P1638L;
            protected  int beginIp65504P1639S;
            protected  int beginIp65504P1639L;
            protected  int beginIp65504P1640S;
            protected  int beginIp65504P1640L;
            protected  int beginIp65504P1641S;
            protected  int beginIp65504P1641L;
            protected  int beginIp65504P1642S;
            protected  int beginIp65504P1642L;
            protected  int beginIp65504P1643S;
            protected  int beginIp65504P1643L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup53Serialized
	**/
    public Ip65504PdsNamesLargeGroup53Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup53Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup53Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup53Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12892); // serialize this field at offset 12892 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup53Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12892 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup53Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_53_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1613S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1613L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1614S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1614L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1615S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1615L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1616S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1616L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1617S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1617L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1618S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1618L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1619S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1619L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1620S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1620L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1621S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1621L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1622S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1622L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1623S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1623L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1624S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1624L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1625S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1625L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1626S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1626L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1627S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1627L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1628S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1628L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1629S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1629L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1630S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1630L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1631S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1631L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1632S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1632L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1633S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1633L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1634S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1634L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1635S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1635L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1636S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1636L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1637S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1637L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1638S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1638L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1639S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1639L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1640S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1640L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1641S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1641L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1642S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1642L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1643S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1643L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1613SCounter = -1;
         public boolean isIp65504P1613SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1613SCounter != sharedCounter;
            localIp65504P1613SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1613_S_LEN = 2;
  	/**
	 * serializeIp65504P1613S
	 */
	protected void serializeIp65504P1613S(short ip65504P1613S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1613S,IP_65504_P_1613_S_LEN)
                  ,beginIp65504P1613S
                  ,IP_65504_P_1613_S_LEN
                 );
            localIp65504P1613SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1613SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1613S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1613S() {	 
			return (getShort(beginIp65504P1613S));
   	}
         int localIp65504P1613LCounter = -1;
         public boolean isIp65504P1613LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1613LCounter != sharedCounter;
            localIp65504P1613LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1613_L_LEN = 2;
  	/**
	 * serializeIp65504P1613L
	 */
	protected void serializeIp65504P1613L(short ip65504P1613L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1613L,IP_65504_P_1613_L_LEN)
                  ,beginIp65504P1613L
                  ,IP_65504_P_1613_L_LEN
                 );
            localIp65504P1613LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1613LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1613L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1613L() {	 
			return (getShort(beginIp65504P1613L));
   	}
         int localIp65504P1614SCounter = -1;
         public boolean isIp65504P1614SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1614SCounter != sharedCounter;
            localIp65504P1614SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1614_S_LEN = 2;
  	/**
	 * serializeIp65504P1614S
	 */
	protected void serializeIp65504P1614S(short ip65504P1614S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1614S,IP_65504_P_1614_S_LEN)
                  ,beginIp65504P1614S
                  ,IP_65504_P_1614_S_LEN
                 );
            localIp65504P1614SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1614SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1614S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1614S() {	 
			return (getShort(beginIp65504P1614S));
   	}
         int localIp65504P1614LCounter = -1;
         public boolean isIp65504P1614LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1614LCounter != sharedCounter;
            localIp65504P1614LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1614_L_LEN = 2;
  	/**
	 * serializeIp65504P1614L
	 */
	protected void serializeIp65504P1614L(short ip65504P1614L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1614L,IP_65504_P_1614_L_LEN)
                  ,beginIp65504P1614L
                  ,IP_65504_P_1614_L_LEN
                 );
            localIp65504P1614LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1614LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1614L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1614L() {	 
			return (getShort(beginIp65504P1614L));
   	}
         int localIp65504P1615SCounter = -1;
         public boolean isIp65504P1615SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1615SCounter != sharedCounter;
            localIp65504P1615SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1615_S_LEN = 2;
  	/**
	 * serializeIp65504P1615S
	 */
	protected void serializeIp65504P1615S(short ip65504P1615S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1615S,IP_65504_P_1615_S_LEN)
                  ,beginIp65504P1615S
                  ,IP_65504_P_1615_S_LEN
                 );
            localIp65504P1615SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1615SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1615S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1615S() {	 
			return (getShort(beginIp65504P1615S));
   	}
         int localIp65504P1615LCounter = -1;
         public boolean isIp65504P1615LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1615LCounter != sharedCounter;
            localIp65504P1615LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1615_L_LEN = 2;
  	/**
	 * serializeIp65504P1615L
	 */
	protected void serializeIp65504P1615L(short ip65504P1615L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1615L,IP_65504_P_1615_L_LEN)
                  ,beginIp65504P1615L
                  ,IP_65504_P_1615_L_LEN
                 );
            localIp65504P1615LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1615LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1615L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1615L() {	 
			return (getShort(beginIp65504P1615L));
   	}
         int localIp65504P1616SCounter = -1;
         public boolean isIp65504P1616SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1616SCounter != sharedCounter;
            localIp65504P1616SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1616_S_LEN = 2;
  	/**
	 * serializeIp65504P1616S
	 */
	protected void serializeIp65504P1616S(short ip65504P1616S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1616S,IP_65504_P_1616_S_LEN)
                  ,beginIp65504P1616S
                  ,IP_65504_P_1616_S_LEN
                 );
            localIp65504P1616SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1616SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1616S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1616S() {	 
			return (getShort(beginIp65504P1616S));
   	}
         int localIp65504P1616LCounter = -1;
         public boolean isIp65504P1616LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1616LCounter != sharedCounter;
            localIp65504P1616LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1616_L_LEN = 2;
  	/**
	 * serializeIp65504P1616L
	 */
	protected void serializeIp65504P1616L(short ip65504P1616L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1616L,IP_65504_P_1616_L_LEN)
                  ,beginIp65504P1616L
                  ,IP_65504_P_1616_L_LEN
                 );
            localIp65504P1616LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1616LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1616L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1616L() {	 
			return (getShort(beginIp65504P1616L));
   	}
         int localIp65504P1617SCounter = -1;
         public boolean isIp65504P1617SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1617SCounter != sharedCounter;
            localIp65504P1617SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1617_S_LEN = 2;
  	/**
	 * serializeIp65504P1617S
	 */
	protected void serializeIp65504P1617S(short ip65504P1617S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1617S,IP_65504_P_1617_S_LEN)
                  ,beginIp65504P1617S
                  ,IP_65504_P_1617_S_LEN
                 );
            localIp65504P1617SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1617SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1617S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1617S() {	 
			return (getShort(beginIp65504P1617S));
   	}
         int localIp65504P1617LCounter = -1;
         public boolean isIp65504P1617LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1617LCounter != sharedCounter;
            localIp65504P1617LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1617_L_LEN = 2;
  	/**
	 * serializeIp65504P1617L
	 */
	protected void serializeIp65504P1617L(short ip65504P1617L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1617L,IP_65504_P_1617_L_LEN)
                  ,beginIp65504P1617L
                  ,IP_65504_P_1617_L_LEN
                 );
            localIp65504P1617LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1617LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1617L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1617L() {	 
			return (getShort(beginIp65504P1617L));
   	}
         int localIp65504P1618SCounter = -1;
         public boolean isIp65504P1618SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1618SCounter != sharedCounter;
            localIp65504P1618SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1618_S_LEN = 2;
  	/**
	 * serializeIp65504P1618S
	 */
	protected void serializeIp65504P1618S(short ip65504P1618S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1618S,IP_65504_P_1618_S_LEN)
                  ,beginIp65504P1618S
                  ,IP_65504_P_1618_S_LEN
                 );
            localIp65504P1618SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1618SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1618S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1618S() {	 
			return (getShort(beginIp65504P1618S));
   	}
         int localIp65504P1618LCounter = -1;
         public boolean isIp65504P1618LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1618LCounter != sharedCounter;
            localIp65504P1618LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1618_L_LEN = 2;
  	/**
	 * serializeIp65504P1618L
	 */
	protected void serializeIp65504P1618L(short ip65504P1618L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1618L,IP_65504_P_1618_L_LEN)
                  ,beginIp65504P1618L
                  ,IP_65504_P_1618_L_LEN
                 );
            localIp65504P1618LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1618LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1618L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1618L() {	 
			return (getShort(beginIp65504P1618L));
   	}
         int localIp65504P1619SCounter = -1;
         public boolean isIp65504P1619SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1619SCounter != sharedCounter;
            localIp65504P1619SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1619_S_LEN = 2;
  	/**
	 * serializeIp65504P1619S
	 */
	protected void serializeIp65504P1619S(short ip65504P1619S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1619S,IP_65504_P_1619_S_LEN)
                  ,beginIp65504P1619S
                  ,IP_65504_P_1619_S_LEN
                 );
            localIp65504P1619SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1619SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1619S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1619S() {	 
			return (getShort(beginIp65504P1619S));
   	}
         int localIp65504P1619LCounter = -1;
         public boolean isIp65504P1619LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1619LCounter != sharedCounter;
            localIp65504P1619LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1619_L_LEN = 2;
  	/**
	 * serializeIp65504P1619L
	 */
	protected void serializeIp65504P1619L(short ip65504P1619L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1619L,IP_65504_P_1619_L_LEN)
                  ,beginIp65504P1619L
                  ,IP_65504_P_1619_L_LEN
                 );
            localIp65504P1619LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1619LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1619L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1619L() {	 
			return (getShort(beginIp65504P1619L));
   	}
         int localIp65504P1620SCounter = -1;
         public boolean isIp65504P1620SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1620SCounter != sharedCounter;
            localIp65504P1620SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1620_S_LEN = 2;
  	/**
	 * serializeIp65504P1620S
	 */
	protected void serializeIp65504P1620S(short ip65504P1620S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1620S,IP_65504_P_1620_S_LEN)
                  ,beginIp65504P1620S
                  ,IP_65504_P_1620_S_LEN
                 );
            localIp65504P1620SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1620SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1620S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1620S() {	 
			return (getShort(beginIp65504P1620S));
   	}
         int localIp65504P1620LCounter = -1;
         public boolean isIp65504P1620LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1620LCounter != sharedCounter;
            localIp65504P1620LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1620_L_LEN = 2;
  	/**
	 * serializeIp65504P1620L
	 */
	protected void serializeIp65504P1620L(short ip65504P1620L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1620L,IP_65504_P_1620_L_LEN)
                  ,beginIp65504P1620L
                  ,IP_65504_P_1620_L_LEN
                 );
            localIp65504P1620LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1620LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1620L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1620L() {	 
			return (getShort(beginIp65504P1620L));
   	}
         int localIp65504P1621SCounter = -1;
         public boolean isIp65504P1621SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1621SCounter != sharedCounter;
            localIp65504P1621SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1621_S_LEN = 2;
  	/**
	 * serializeIp65504P1621S
	 */
	protected void serializeIp65504P1621S(short ip65504P1621S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1621S,IP_65504_P_1621_S_LEN)
                  ,beginIp65504P1621S
                  ,IP_65504_P_1621_S_LEN
                 );
            localIp65504P1621SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1621SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1621S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1621S() {	 
			return (getShort(beginIp65504P1621S));
   	}
         int localIp65504P1621LCounter = -1;
         public boolean isIp65504P1621LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1621LCounter != sharedCounter;
            localIp65504P1621LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1621_L_LEN = 2;
  	/**
	 * serializeIp65504P1621L
	 */
	protected void serializeIp65504P1621L(short ip65504P1621L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1621L,IP_65504_P_1621_L_LEN)
                  ,beginIp65504P1621L
                  ,IP_65504_P_1621_L_LEN
                 );
            localIp65504P1621LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1621LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1621L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1621L() {	 
			return (getShort(beginIp65504P1621L));
   	}
         int localIp65504P1622SCounter = -1;
         public boolean isIp65504P1622SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1622SCounter != sharedCounter;
            localIp65504P1622SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1622_S_LEN = 2;
  	/**
	 * serializeIp65504P1622S
	 */
	protected void serializeIp65504P1622S(short ip65504P1622S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1622S,IP_65504_P_1622_S_LEN)
                  ,beginIp65504P1622S
                  ,IP_65504_P_1622_S_LEN
                 );
            localIp65504P1622SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1622SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1622S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1622S() {	 
			return (getShort(beginIp65504P1622S));
   	}
         int localIp65504P1622LCounter = -1;
         public boolean isIp65504P1622LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1622LCounter != sharedCounter;
            localIp65504P1622LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1622_L_LEN = 2;
  	/**
	 * serializeIp65504P1622L
	 */
	protected void serializeIp65504P1622L(short ip65504P1622L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1622L,IP_65504_P_1622_L_LEN)
                  ,beginIp65504P1622L
                  ,IP_65504_P_1622_L_LEN
                 );
            localIp65504P1622LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1622LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1622L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1622L() {	 
			return (getShort(beginIp65504P1622L));
   	}
         int localIp65504P1623SCounter = -1;
         public boolean isIp65504P1623SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1623SCounter != sharedCounter;
            localIp65504P1623SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1623_S_LEN = 2;
  	/**
	 * serializeIp65504P1623S
	 */
	protected void serializeIp65504P1623S(short ip65504P1623S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1623S,IP_65504_P_1623_S_LEN)
                  ,beginIp65504P1623S
                  ,IP_65504_P_1623_S_LEN
                 );
            localIp65504P1623SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1623SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1623S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1623S() {	 
			return (getShort(beginIp65504P1623S));
   	}
         int localIp65504P1623LCounter = -1;
         public boolean isIp65504P1623LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1623LCounter != sharedCounter;
            localIp65504P1623LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1623_L_LEN = 2;
  	/**
	 * serializeIp65504P1623L
	 */
	protected void serializeIp65504P1623L(short ip65504P1623L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1623L,IP_65504_P_1623_L_LEN)
                  ,beginIp65504P1623L
                  ,IP_65504_P_1623_L_LEN
                 );
            localIp65504P1623LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1623LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1623L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1623L() {	 
			return (getShort(beginIp65504P1623L));
   	}
         int localIp65504P1624SCounter = -1;
         public boolean isIp65504P1624SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1624SCounter != sharedCounter;
            localIp65504P1624SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1624_S_LEN = 2;
  	/**
	 * serializeIp65504P1624S
	 */
	protected void serializeIp65504P1624S(short ip65504P1624S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1624S,IP_65504_P_1624_S_LEN)
                  ,beginIp65504P1624S
                  ,IP_65504_P_1624_S_LEN
                 );
            localIp65504P1624SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1624SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1624S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1624S() {	 
			return (getShort(beginIp65504P1624S));
   	}
         int localIp65504P1624LCounter = -1;
         public boolean isIp65504P1624LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1624LCounter != sharedCounter;
            localIp65504P1624LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1624_L_LEN = 2;
  	/**
	 * serializeIp65504P1624L
	 */
	protected void serializeIp65504P1624L(short ip65504P1624L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1624L,IP_65504_P_1624_L_LEN)
                  ,beginIp65504P1624L
                  ,IP_65504_P_1624_L_LEN
                 );
            localIp65504P1624LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1624LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1624L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1624L() {	 
			return (getShort(beginIp65504P1624L));
   	}
         int localIp65504P1625SCounter = -1;
         public boolean isIp65504P1625SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1625SCounter != sharedCounter;
            localIp65504P1625SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1625_S_LEN = 2;
  	/**
	 * serializeIp65504P1625S
	 */
	protected void serializeIp65504P1625S(short ip65504P1625S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1625S,IP_65504_P_1625_S_LEN)
                  ,beginIp65504P1625S
                  ,IP_65504_P_1625_S_LEN
                 );
            localIp65504P1625SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1625SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1625S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1625S() {	 
			return (getShort(beginIp65504P1625S));
   	}
         int localIp65504P1625LCounter = -1;
         public boolean isIp65504P1625LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1625LCounter != sharedCounter;
            localIp65504P1625LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1625_L_LEN = 2;
  	/**
	 * serializeIp65504P1625L
	 */
	protected void serializeIp65504P1625L(short ip65504P1625L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1625L,IP_65504_P_1625_L_LEN)
                  ,beginIp65504P1625L
                  ,IP_65504_P_1625_L_LEN
                 );
            localIp65504P1625LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1625LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1625L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1625L() {	 
			return (getShort(beginIp65504P1625L));
   	}
         int localIp65504P1626SCounter = -1;
         public boolean isIp65504P1626SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1626SCounter != sharedCounter;
            localIp65504P1626SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1626_S_LEN = 2;
  	/**
	 * serializeIp65504P1626S
	 */
	protected void serializeIp65504P1626S(short ip65504P1626S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1626S,IP_65504_P_1626_S_LEN)
                  ,beginIp65504P1626S
                  ,IP_65504_P_1626_S_LEN
                 );
            localIp65504P1626SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1626SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1626S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1626S() {	 
			return (getShort(beginIp65504P1626S));
   	}
         int localIp65504P1626LCounter = -1;
         public boolean isIp65504P1626LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1626LCounter != sharedCounter;
            localIp65504P1626LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1626_L_LEN = 2;
  	/**
	 * serializeIp65504P1626L
	 */
	protected void serializeIp65504P1626L(short ip65504P1626L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1626L,IP_65504_P_1626_L_LEN)
                  ,beginIp65504P1626L
                  ,IP_65504_P_1626_L_LEN
                 );
            localIp65504P1626LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1626LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1626L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1626L() {	 
			return (getShort(beginIp65504P1626L));
   	}
         int localIp65504P1627SCounter = -1;
         public boolean isIp65504P1627SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1627SCounter != sharedCounter;
            localIp65504P1627SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1627_S_LEN = 2;
  	/**
	 * serializeIp65504P1627S
	 */
	protected void serializeIp65504P1627S(short ip65504P1627S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1627S,IP_65504_P_1627_S_LEN)
                  ,beginIp65504P1627S
                  ,IP_65504_P_1627_S_LEN
                 );
            localIp65504P1627SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1627SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1627S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1627S() {	 
			return (getShort(beginIp65504P1627S));
   	}
         int localIp65504P1627LCounter = -1;
         public boolean isIp65504P1627LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1627LCounter != sharedCounter;
            localIp65504P1627LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1627_L_LEN = 2;
  	/**
	 * serializeIp65504P1627L
	 */
	protected void serializeIp65504P1627L(short ip65504P1627L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1627L,IP_65504_P_1627_L_LEN)
                  ,beginIp65504P1627L
                  ,IP_65504_P_1627_L_LEN
                 );
            localIp65504P1627LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1627LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1627L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1627L() {	 
			return (getShort(beginIp65504P1627L));
   	}
         int localIp65504P1628SCounter = -1;
         public boolean isIp65504P1628SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1628SCounter != sharedCounter;
            localIp65504P1628SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1628_S_LEN = 2;
  	/**
	 * serializeIp65504P1628S
	 */
	protected void serializeIp65504P1628S(short ip65504P1628S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1628S,IP_65504_P_1628_S_LEN)
                  ,beginIp65504P1628S
                  ,IP_65504_P_1628_S_LEN
                 );
            localIp65504P1628SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1628SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1628S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1628S() {	 
			return (getShort(beginIp65504P1628S));
   	}
         int localIp65504P1628LCounter = -1;
         public boolean isIp65504P1628LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1628LCounter != sharedCounter;
            localIp65504P1628LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1628_L_LEN = 2;
  	/**
	 * serializeIp65504P1628L
	 */
	protected void serializeIp65504P1628L(short ip65504P1628L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1628L,IP_65504_P_1628_L_LEN)
                  ,beginIp65504P1628L
                  ,IP_65504_P_1628_L_LEN
                 );
            localIp65504P1628LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1628LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1628L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1628L() {	 
			return (getShort(beginIp65504P1628L));
   	}
         int localIp65504P1629SCounter = -1;
         public boolean isIp65504P1629SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1629SCounter != sharedCounter;
            localIp65504P1629SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1629_S_LEN = 2;
  	/**
	 * serializeIp65504P1629S
	 */
	protected void serializeIp65504P1629S(short ip65504P1629S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1629S,IP_65504_P_1629_S_LEN)
                  ,beginIp65504P1629S
                  ,IP_65504_P_1629_S_LEN
                 );
            localIp65504P1629SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1629SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1629S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1629S() {	 
			return (getShort(beginIp65504P1629S));
   	}
         int localIp65504P1629LCounter = -1;
         public boolean isIp65504P1629LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1629LCounter != sharedCounter;
            localIp65504P1629LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1629_L_LEN = 2;
  	/**
	 * serializeIp65504P1629L
	 */
	protected void serializeIp65504P1629L(short ip65504P1629L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1629L,IP_65504_P_1629_L_LEN)
                  ,beginIp65504P1629L
                  ,IP_65504_P_1629_L_LEN
                 );
            localIp65504P1629LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1629LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1629L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1629L() {	 
			return (getShort(beginIp65504P1629L));
   	}
         int localIp65504P1630SCounter = -1;
         public boolean isIp65504P1630SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1630SCounter != sharedCounter;
            localIp65504P1630SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1630_S_LEN = 2;
  	/**
	 * serializeIp65504P1630S
	 */
	protected void serializeIp65504P1630S(short ip65504P1630S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1630S,IP_65504_P_1630_S_LEN)
                  ,beginIp65504P1630S
                  ,IP_65504_P_1630_S_LEN
                 );
            localIp65504P1630SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1630SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1630S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1630S() {	 
			return (getShort(beginIp65504P1630S));
   	}
         int localIp65504P1630LCounter = -1;
         public boolean isIp65504P1630LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1630LCounter != sharedCounter;
            localIp65504P1630LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1630_L_LEN = 2;
  	/**
	 * serializeIp65504P1630L
	 */
	protected void serializeIp65504P1630L(short ip65504P1630L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1630L,IP_65504_P_1630_L_LEN)
                  ,beginIp65504P1630L
                  ,IP_65504_P_1630_L_LEN
                 );
            localIp65504P1630LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1630LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1630L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1630L() {	 
			return (getShort(beginIp65504P1630L));
   	}
         int localIp65504P1631SCounter = -1;
         public boolean isIp65504P1631SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1631SCounter != sharedCounter;
            localIp65504P1631SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1631_S_LEN = 2;
  	/**
	 * serializeIp65504P1631S
	 */
	protected void serializeIp65504P1631S(short ip65504P1631S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1631S,IP_65504_P_1631_S_LEN)
                  ,beginIp65504P1631S
                  ,IP_65504_P_1631_S_LEN
                 );
            localIp65504P1631SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1631SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1631S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1631S() {	 
			return (getShort(beginIp65504P1631S));
   	}
         int localIp65504P1631LCounter = -1;
         public boolean isIp65504P1631LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1631LCounter != sharedCounter;
            localIp65504P1631LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1631_L_LEN = 2;
  	/**
	 * serializeIp65504P1631L
	 */
	protected void serializeIp65504P1631L(short ip65504P1631L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1631L,IP_65504_P_1631_L_LEN)
                  ,beginIp65504P1631L
                  ,IP_65504_P_1631_L_LEN
                 );
            localIp65504P1631LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1631LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1631L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1631L() {	 
			return (getShort(beginIp65504P1631L));
   	}
         int localIp65504P1632SCounter = -1;
         public boolean isIp65504P1632SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1632SCounter != sharedCounter;
            localIp65504P1632SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1632_S_LEN = 2;
  	/**
	 * serializeIp65504P1632S
	 */
	protected void serializeIp65504P1632S(short ip65504P1632S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1632S,IP_65504_P_1632_S_LEN)
                  ,beginIp65504P1632S
                  ,IP_65504_P_1632_S_LEN
                 );
            localIp65504P1632SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1632SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1632S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1632S() {	 
			return (getShort(beginIp65504P1632S));
   	}
         int localIp65504P1632LCounter = -1;
         public boolean isIp65504P1632LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1632LCounter != sharedCounter;
            localIp65504P1632LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1632_L_LEN = 2;
  	/**
	 * serializeIp65504P1632L
	 */
	protected void serializeIp65504P1632L(short ip65504P1632L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1632L,IP_65504_P_1632_L_LEN)
                  ,beginIp65504P1632L
                  ,IP_65504_P_1632_L_LEN
                 );
            localIp65504P1632LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1632LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1632L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1632L() {	 
			return (getShort(beginIp65504P1632L));
   	}
         int localIp65504P1633SCounter = -1;
         public boolean isIp65504P1633SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1633SCounter != sharedCounter;
            localIp65504P1633SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1633_S_LEN = 2;
  	/**
	 * serializeIp65504P1633S
	 */
	protected void serializeIp65504P1633S(short ip65504P1633S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1633S,IP_65504_P_1633_S_LEN)
                  ,beginIp65504P1633S
                  ,IP_65504_P_1633_S_LEN
                 );
            localIp65504P1633SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1633SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1633S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1633S() {	 
			return (getShort(beginIp65504P1633S));
   	}
         int localIp65504P1633LCounter = -1;
         public boolean isIp65504P1633LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1633LCounter != sharedCounter;
            localIp65504P1633LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1633_L_LEN = 2;
  	/**
	 * serializeIp65504P1633L
	 */
	protected void serializeIp65504P1633L(short ip65504P1633L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1633L,IP_65504_P_1633_L_LEN)
                  ,beginIp65504P1633L
                  ,IP_65504_P_1633_L_LEN
                 );
            localIp65504P1633LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1633LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1633L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1633L() {	 
			return (getShort(beginIp65504P1633L));
   	}
         int localIp65504P1634SCounter = -1;
         public boolean isIp65504P1634SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1634SCounter != sharedCounter;
            localIp65504P1634SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1634_S_LEN = 2;
  	/**
	 * serializeIp65504P1634S
	 */
	protected void serializeIp65504P1634S(short ip65504P1634S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1634S,IP_65504_P_1634_S_LEN)
                  ,beginIp65504P1634S
                  ,IP_65504_P_1634_S_LEN
                 );
            localIp65504P1634SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1634SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1634S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1634S() {	 
			return (getShort(beginIp65504P1634S));
   	}
         int localIp65504P1634LCounter = -1;
         public boolean isIp65504P1634LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1634LCounter != sharedCounter;
            localIp65504P1634LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1634_L_LEN = 2;
  	/**
	 * serializeIp65504P1634L
	 */
	protected void serializeIp65504P1634L(short ip65504P1634L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1634L,IP_65504_P_1634_L_LEN)
                  ,beginIp65504P1634L
                  ,IP_65504_P_1634_L_LEN
                 );
            localIp65504P1634LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1634LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1634L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1634L() {	 
			return (getShort(beginIp65504P1634L));
   	}
         int localIp65504P1635SCounter = -1;
         public boolean isIp65504P1635SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1635SCounter != sharedCounter;
            localIp65504P1635SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1635_S_LEN = 2;
  	/**
	 * serializeIp65504P1635S
	 */
	protected void serializeIp65504P1635S(short ip65504P1635S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1635S,IP_65504_P_1635_S_LEN)
                  ,beginIp65504P1635S
                  ,IP_65504_P_1635_S_LEN
                 );
            localIp65504P1635SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1635SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1635S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1635S() {	 
			return (getShort(beginIp65504P1635S));
   	}
         int localIp65504P1635LCounter = -1;
         public boolean isIp65504P1635LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1635LCounter != sharedCounter;
            localIp65504P1635LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1635_L_LEN = 2;
  	/**
	 * serializeIp65504P1635L
	 */
	protected void serializeIp65504P1635L(short ip65504P1635L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1635L,IP_65504_P_1635_L_LEN)
                  ,beginIp65504P1635L
                  ,IP_65504_P_1635_L_LEN
                 );
            localIp65504P1635LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1635LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1635L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1635L() {	 
			return (getShort(beginIp65504P1635L));
   	}
         int localIp65504P1636SCounter = -1;
         public boolean isIp65504P1636SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1636SCounter != sharedCounter;
            localIp65504P1636SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1636_S_LEN = 2;
  	/**
	 * serializeIp65504P1636S
	 */
	protected void serializeIp65504P1636S(short ip65504P1636S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1636S,IP_65504_P_1636_S_LEN)
                  ,beginIp65504P1636S
                  ,IP_65504_P_1636_S_LEN
                 );
            localIp65504P1636SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1636SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1636S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1636S() {	 
			return (getShort(beginIp65504P1636S));
   	}
         int localIp65504P1636LCounter = -1;
         public boolean isIp65504P1636LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1636LCounter != sharedCounter;
            localIp65504P1636LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1636_L_LEN = 2;
  	/**
	 * serializeIp65504P1636L
	 */
	protected void serializeIp65504P1636L(short ip65504P1636L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1636L,IP_65504_P_1636_L_LEN)
                  ,beginIp65504P1636L
                  ,IP_65504_P_1636_L_LEN
                 );
            localIp65504P1636LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1636LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1636L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1636L() {	 
			return (getShort(beginIp65504P1636L));
   	}
         int localIp65504P1637SCounter = -1;
         public boolean isIp65504P1637SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1637SCounter != sharedCounter;
            localIp65504P1637SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1637_S_LEN = 2;
  	/**
	 * serializeIp65504P1637S
	 */
	protected void serializeIp65504P1637S(short ip65504P1637S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1637S,IP_65504_P_1637_S_LEN)
                  ,beginIp65504P1637S
                  ,IP_65504_P_1637_S_LEN
                 );
            localIp65504P1637SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1637SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1637S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1637S() {	 
			return (getShort(beginIp65504P1637S));
   	}
         int localIp65504P1637LCounter = -1;
         public boolean isIp65504P1637LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1637LCounter != sharedCounter;
            localIp65504P1637LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1637_L_LEN = 2;
  	/**
	 * serializeIp65504P1637L
	 */
	protected void serializeIp65504P1637L(short ip65504P1637L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1637L,IP_65504_P_1637_L_LEN)
                  ,beginIp65504P1637L
                  ,IP_65504_P_1637_L_LEN
                 );
            localIp65504P1637LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1637LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1637L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1637L() {	 
			return (getShort(beginIp65504P1637L));
   	}
         int localIp65504P1638SCounter = -1;
         public boolean isIp65504P1638SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1638SCounter != sharedCounter;
            localIp65504P1638SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1638_S_LEN = 2;
  	/**
	 * serializeIp65504P1638S
	 */
	protected void serializeIp65504P1638S(short ip65504P1638S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1638S,IP_65504_P_1638_S_LEN)
                  ,beginIp65504P1638S
                  ,IP_65504_P_1638_S_LEN
                 );
            localIp65504P1638SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1638SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1638S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1638S() {	 
			return (getShort(beginIp65504P1638S));
   	}
         int localIp65504P1638LCounter = -1;
         public boolean isIp65504P1638LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1638LCounter != sharedCounter;
            localIp65504P1638LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1638_L_LEN = 2;
  	/**
	 * serializeIp65504P1638L
	 */
	protected void serializeIp65504P1638L(short ip65504P1638L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1638L,IP_65504_P_1638_L_LEN)
                  ,beginIp65504P1638L
                  ,IP_65504_P_1638_L_LEN
                 );
            localIp65504P1638LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1638LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1638L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1638L() {	 
			return (getShort(beginIp65504P1638L));
   	}
         int localIp65504P1639SCounter = -1;
         public boolean isIp65504P1639SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1639SCounter != sharedCounter;
            localIp65504P1639SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1639_S_LEN = 2;
  	/**
	 * serializeIp65504P1639S
	 */
	protected void serializeIp65504P1639S(short ip65504P1639S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1639S,IP_65504_P_1639_S_LEN)
                  ,beginIp65504P1639S
                  ,IP_65504_P_1639_S_LEN
                 );
            localIp65504P1639SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1639SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1639S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1639S() {	 
			return (getShort(beginIp65504P1639S));
   	}
         int localIp65504P1639LCounter = -1;
         public boolean isIp65504P1639LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1639LCounter != sharedCounter;
            localIp65504P1639LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1639_L_LEN = 2;
  	/**
	 * serializeIp65504P1639L
	 */
	protected void serializeIp65504P1639L(short ip65504P1639L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1639L,IP_65504_P_1639_L_LEN)
                  ,beginIp65504P1639L
                  ,IP_65504_P_1639_L_LEN
                 );
            localIp65504P1639LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1639LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1639L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1639L() {	 
			return (getShort(beginIp65504P1639L));
   	}
         int localIp65504P1640SCounter = -1;
         public boolean isIp65504P1640SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1640SCounter != sharedCounter;
            localIp65504P1640SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1640_S_LEN = 2;
  	/**
	 * serializeIp65504P1640S
	 */
	protected void serializeIp65504P1640S(short ip65504P1640S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1640S,IP_65504_P_1640_S_LEN)
                  ,beginIp65504P1640S
                  ,IP_65504_P_1640_S_LEN
                 );
            localIp65504P1640SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1640SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1640S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1640S() {	 
			return (getShort(beginIp65504P1640S));
   	}
         int localIp65504P1640LCounter = -1;
         public boolean isIp65504P1640LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1640LCounter != sharedCounter;
            localIp65504P1640LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1640_L_LEN = 2;
  	/**
	 * serializeIp65504P1640L
	 */
	protected void serializeIp65504P1640L(short ip65504P1640L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1640L,IP_65504_P_1640_L_LEN)
                  ,beginIp65504P1640L
                  ,IP_65504_P_1640_L_LEN
                 );
            localIp65504P1640LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1640LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1640L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1640L() {	 
			return (getShort(beginIp65504P1640L));
   	}
         int localIp65504P1641SCounter = -1;
         public boolean isIp65504P1641SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1641SCounter != sharedCounter;
            localIp65504P1641SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1641_S_LEN = 2;
  	/**
	 * serializeIp65504P1641S
	 */
	protected void serializeIp65504P1641S(short ip65504P1641S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1641S,IP_65504_P_1641_S_LEN)
                  ,beginIp65504P1641S
                  ,IP_65504_P_1641_S_LEN
                 );
            localIp65504P1641SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1641SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1641S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1641S() {	 
			return (getShort(beginIp65504P1641S));
   	}
         int localIp65504P1641LCounter = -1;
         public boolean isIp65504P1641LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1641LCounter != sharedCounter;
            localIp65504P1641LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1641_L_LEN = 2;
  	/**
	 * serializeIp65504P1641L
	 */
	protected void serializeIp65504P1641L(short ip65504P1641L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1641L,IP_65504_P_1641_L_LEN)
                  ,beginIp65504P1641L
                  ,IP_65504_P_1641_L_LEN
                 );
            localIp65504P1641LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1641LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1641L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1641L() {	 
			return (getShort(beginIp65504P1641L));
   	}
         int localIp65504P1642SCounter = -1;
         public boolean isIp65504P1642SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1642SCounter != sharedCounter;
            localIp65504P1642SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1642_S_LEN = 2;
  	/**
	 * serializeIp65504P1642S
	 */
	protected void serializeIp65504P1642S(short ip65504P1642S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1642S,IP_65504_P_1642_S_LEN)
                  ,beginIp65504P1642S
                  ,IP_65504_P_1642_S_LEN
                 );
            localIp65504P1642SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1642SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1642S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1642S() {	 
			return (getShort(beginIp65504P1642S));
   	}
         int localIp65504P1642LCounter = -1;
         public boolean isIp65504P1642LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1642LCounter != sharedCounter;
            localIp65504P1642LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1642_L_LEN = 2;
  	/**
	 * serializeIp65504P1642L
	 */
	protected void serializeIp65504P1642L(short ip65504P1642L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1642L,IP_65504_P_1642_L_LEN)
                  ,beginIp65504P1642L
                  ,IP_65504_P_1642_L_LEN
                 );
            localIp65504P1642LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1642LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1642L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1642L() {	 
			return (getShort(beginIp65504P1642L));
   	}
         int localIp65504P1643SCounter = -1;
         public boolean isIp65504P1643SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1643SCounter != sharedCounter;
            localIp65504P1643SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1643_S_LEN = 2;
  	/**
	 * serializeIp65504P1643S
	 */
	protected void serializeIp65504P1643S(short ip65504P1643S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1643S,IP_65504_P_1643_S_LEN)
                  ,beginIp65504P1643S
                  ,IP_65504_P_1643_S_LEN
                 );
            localIp65504P1643SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1643SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1643S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1643S() {	 
			return (getShort(beginIp65504P1643S));
   	}
         int localIp65504P1643LCounter = -1;
         public boolean isIp65504P1643LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1643LCounter != sharedCounter;
            localIp65504P1643LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1643_L_LEN = 2;
  	/**
	 * serializeIp65504P1643L
	 */
	protected void serializeIp65504P1643L(short ip65504P1643L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1643L,IP_65504_P_1643_L_LEN)
                  ,beginIp65504P1643L
                  ,IP_65504_P_1643_L_LEN
                 );
            localIp65504P1643LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1643LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1643L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1643L() {	 
			return (getShort(beginIp65504P1643L));
   	}




}
  
