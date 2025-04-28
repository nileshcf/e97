package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup54Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup54Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup54Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_54_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1644S;
            protected  int beginIp65504P1644L;
            protected  int beginIp65504P1645S;
            protected  int beginIp65504P1645L;
            protected  int beginIp65504P1646S;
            protected  int beginIp65504P1646L;
            protected  int beginIp65504P1647S;
            protected  int beginIp65504P1647L;
            protected  int beginIp65504P1648S;
            protected  int beginIp65504P1648L;
            protected  int beginIp65504P1649S;
            protected  int beginIp65504P1649L;
            protected  int beginIp65504P1650S;
            protected  int beginIp65504P1650L;
            protected  int beginIp65504P1651S;
            protected  int beginIp65504P1651L;
            protected  int beginIp65504P1652S;
            protected  int beginIp65504P1652L;
            protected  int beginIp65504P1653S;
            protected  int beginIp65504P1653L;
            protected  int beginIp65504P1654S;
            protected  int beginIp65504P1654L;
            protected  int beginIp65504P1655S;
            protected  int beginIp65504P1655L;
            protected  int beginIp65504P1656S;
            protected  int beginIp65504P1656L;
            protected  int beginIp65504P1657S;
            protected  int beginIp65504P1657L;
            protected  int beginIp65504P1658S;
            protected  int beginIp65504P1658L;
            protected  int beginIp65504P1659S;
            protected  int beginIp65504P1659L;
            protected  int beginIp65504P1660S;
            protected  int beginIp65504P1660L;
            protected  int beginIp65504P1661S;
            protected  int beginIp65504P1661L;
            protected  int beginIp65504P1662S;
            protected  int beginIp65504P1662L;
            protected  int beginIp65504P1663S;
            protected  int beginIp65504P1663L;
            protected  int beginIp65504P1664S;
            protected  int beginIp65504P1664L;
            protected  int beginIp65504P1665S;
            protected  int beginIp65504P1665L;
            protected  int beginIp65504P1666S;
            protected  int beginIp65504P1666L;
            protected  int beginIp65504P1667S;
            protected  int beginIp65504P1667L;
            protected  int beginIp65504P1668S;
            protected  int beginIp65504P1668L;
            protected  int beginIp65504P1669S;
            protected  int beginIp65504P1669L;
            protected  int beginIp65504P1670S;
            protected  int beginIp65504P1670L;
            protected  int beginIp65504P1671S;
            protected  int beginIp65504P1671L;
            protected  int beginIp65504P1672S;
            protected  int beginIp65504P1672L;
            protected  int beginIp65504P1673S;
            protected  int beginIp65504P1673L;
            protected  int beginIp65504P1674S;
            protected  int beginIp65504P1674L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup54Serialized
	**/
    public Ip65504PdsNamesLargeGroup54Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup54Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup54Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup54Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13140); // serialize this field at offset 13140 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup54Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13140 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup54Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_54_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1644S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1644L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1645S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1645L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1646S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1646L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1647S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1647L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1648S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1648L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1649S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1649L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1650S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1650L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1651S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1651L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1652S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1652L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1653S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1653L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1654S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1654L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1655S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1655L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1656S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1656L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1657S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1657L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1658S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1658L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1659S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1659L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1660S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1660L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1661S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1661L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1662S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1662L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1663S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1663L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1664S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1664L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1665S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1665L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1666S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1666L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1667S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1667L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1668S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1668L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1669S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1669L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1670S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1670L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1671S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1671L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1672S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1672L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1673S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1673L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1674S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1674L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1644SCounter = -1;
         public boolean isIp65504P1644SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1644SCounter != sharedCounter;
            localIp65504P1644SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1644_S_LEN = 2;
  	/**
	 * serializeIp65504P1644S
	 */
	protected void serializeIp65504P1644S(short ip65504P1644S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1644S,IP_65504_P_1644_S_LEN)
                  ,beginIp65504P1644S
                  ,IP_65504_P_1644_S_LEN
                 );
            localIp65504P1644SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1644SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1644S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1644S() {	 
			return (getShort(beginIp65504P1644S));
   	}
         int localIp65504P1644LCounter = -1;
         public boolean isIp65504P1644LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1644LCounter != sharedCounter;
            localIp65504P1644LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1644_L_LEN = 2;
  	/**
	 * serializeIp65504P1644L
	 */
	protected void serializeIp65504P1644L(short ip65504P1644L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1644L,IP_65504_P_1644_L_LEN)
                  ,beginIp65504P1644L
                  ,IP_65504_P_1644_L_LEN
                 );
            localIp65504P1644LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1644LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1644L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1644L() {	 
			return (getShort(beginIp65504P1644L));
   	}
         int localIp65504P1645SCounter = -1;
         public boolean isIp65504P1645SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1645SCounter != sharedCounter;
            localIp65504P1645SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1645_S_LEN = 2;
  	/**
	 * serializeIp65504P1645S
	 */
	protected void serializeIp65504P1645S(short ip65504P1645S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1645S,IP_65504_P_1645_S_LEN)
                  ,beginIp65504P1645S
                  ,IP_65504_P_1645_S_LEN
                 );
            localIp65504P1645SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1645SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1645S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1645S() {	 
			return (getShort(beginIp65504P1645S));
   	}
         int localIp65504P1645LCounter = -1;
         public boolean isIp65504P1645LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1645LCounter != sharedCounter;
            localIp65504P1645LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1645_L_LEN = 2;
  	/**
	 * serializeIp65504P1645L
	 */
	protected void serializeIp65504P1645L(short ip65504P1645L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1645L,IP_65504_P_1645_L_LEN)
                  ,beginIp65504P1645L
                  ,IP_65504_P_1645_L_LEN
                 );
            localIp65504P1645LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1645LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1645L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1645L() {	 
			return (getShort(beginIp65504P1645L));
   	}
         int localIp65504P1646SCounter = -1;
         public boolean isIp65504P1646SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1646SCounter != sharedCounter;
            localIp65504P1646SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1646_S_LEN = 2;
  	/**
	 * serializeIp65504P1646S
	 */
	protected void serializeIp65504P1646S(short ip65504P1646S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1646S,IP_65504_P_1646_S_LEN)
                  ,beginIp65504P1646S
                  ,IP_65504_P_1646_S_LEN
                 );
            localIp65504P1646SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1646SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1646S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1646S() {	 
			return (getShort(beginIp65504P1646S));
   	}
         int localIp65504P1646LCounter = -1;
         public boolean isIp65504P1646LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1646LCounter != sharedCounter;
            localIp65504P1646LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1646_L_LEN = 2;
  	/**
	 * serializeIp65504P1646L
	 */
	protected void serializeIp65504P1646L(short ip65504P1646L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1646L,IP_65504_P_1646_L_LEN)
                  ,beginIp65504P1646L
                  ,IP_65504_P_1646_L_LEN
                 );
            localIp65504P1646LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1646LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1646L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1646L() {	 
			return (getShort(beginIp65504P1646L));
   	}
         int localIp65504P1647SCounter = -1;
         public boolean isIp65504P1647SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1647SCounter != sharedCounter;
            localIp65504P1647SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1647_S_LEN = 2;
  	/**
	 * serializeIp65504P1647S
	 */
	protected void serializeIp65504P1647S(short ip65504P1647S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1647S,IP_65504_P_1647_S_LEN)
                  ,beginIp65504P1647S
                  ,IP_65504_P_1647_S_LEN
                 );
            localIp65504P1647SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1647SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1647S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1647S() {	 
			return (getShort(beginIp65504P1647S));
   	}
         int localIp65504P1647LCounter = -1;
         public boolean isIp65504P1647LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1647LCounter != sharedCounter;
            localIp65504P1647LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1647_L_LEN = 2;
  	/**
	 * serializeIp65504P1647L
	 */
	protected void serializeIp65504P1647L(short ip65504P1647L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1647L,IP_65504_P_1647_L_LEN)
                  ,beginIp65504P1647L
                  ,IP_65504_P_1647_L_LEN
                 );
            localIp65504P1647LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1647LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1647L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1647L() {	 
			return (getShort(beginIp65504P1647L));
   	}
         int localIp65504P1648SCounter = -1;
         public boolean isIp65504P1648SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1648SCounter != sharedCounter;
            localIp65504P1648SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1648_S_LEN = 2;
  	/**
	 * serializeIp65504P1648S
	 */
	protected void serializeIp65504P1648S(short ip65504P1648S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1648S,IP_65504_P_1648_S_LEN)
                  ,beginIp65504P1648S
                  ,IP_65504_P_1648_S_LEN
                 );
            localIp65504P1648SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1648SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1648S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1648S() {	 
			return (getShort(beginIp65504P1648S));
   	}
         int localIp65504P1648LCounter = -1;
         public boolean isIp65504P1648LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1648LCounter != sharedCounter;
            localIp65504P1648LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1648_L_LEN = 2;
  	/**
	 * serializeIp65504P1648L
	 */
	protected void serializeIp65504P1648L(short ip65504P1648L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1648L,IP_65504_P_1648_L_LEN)
                  ,beginIp65504P1648L
                  ,IP_65504_P_1648_L_LEN
                 );
            localIp65504P1648LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1648LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1648L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1648L() {	 
			return (getShort(beginIp65504P1648L));
   	}
         int localIp65504P1649SCounter = -1;
         public boolean isIp65504P1649SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1649SCounter != sharedCounter;
            localIp65504P1649SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1649_S_LEN = 2;
  	/**
	 * serializeIp65504P1649S
	 */
	protected void serializeIp65504P1649S(short ip65504P1649S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1649S,IP_65504_P_1649_S_LEN)
                  ,beginIp65504P1649S
                  ,IP_65504_P_1649_S_LEN
                 );
            localIp65504P1649SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1649SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1649S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1649S() {	 
			return (getShort(beginIp65504P1649S));
   	}
         int localIp65504P1649LCounter = -1;
         public boolean isIp65504P1649LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1649LCounter != sharedCounter;
            localIp65504P1649LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1649_L_LEN = 2;
  	/**
	 * serializeIp65504P1649L
	 */
	protected void serializeIp65504P1649L(short ip65504P1649L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1649L,IP_65504_P_1649_L_LEN)
                  ,beginIp65504P1649L
                  ,IP_65504_P_1649_L_LEN
                 );
            localIp65504P1649LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1649LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1649L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1649L() {	 
			return (getShort(beginIp65504P1649L));
   	}
         int localIp65504P1650SCounter = -1;
         public boolean isIp65504P1650SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1650SCounter != sharedCounter;
            localIp65504P1650SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1650_S_LEN = 2;
  	/**
	 * serializeIp65504P1650S
	 */
	protected void serializeIp65504P1650S(short ip65504P1650S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1650S,IP_65504_P_1650_S_LEN)
                  ,beginIp65504P1650S
                  ,IP_65504_P_1650_S_LEN
                 );
            localIp65504P1650SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1650SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1650S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1650S() {	 
			return (getShort(beginIp65504P1650S));
   	}
         int localIp65504P1650LCounter = -1;
         public boolean isIp65504P1650LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1650LCounter != sharedCounter;
            localIp65504P1650LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1650_L_LEN = 2;
  	/**
	 * serializeIp65504P1650L
	 */
	protected void serializeIp65504P1650L(short ip65504P1650L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1650L,IP_65504_P_1650_L_LEN)
                  ,beginIp65504P1650L
                  ,IP_65504_P_1650_L_LEN
                 );
            localIp65504P1650LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1650LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1650L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1650L() {	 
			return (getShort(beginIp65504P1650L));
   	}
         int localIp65504P1651SCounter = -1;
         public boolean isIp65504P1651SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1651SCounter != sharedCounter;
            localIp65504P1651SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1651_S_LEN = 2;
  	/**
	 * serializeIp65504P1651S
	 */
	protected void serializeIp65504P1651S(short ip65504P1651S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1651S,IP_65504_P_1651_S_LEN)
                  ,beginIp65504P1651S
                  ,IP_65504_P_1651_S_LEN
                 );
            localIp65504P1651SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1651SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1651S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1651S() {	 
			return (getShort(beginIp65504P1651S));
   	}
         int localIp65504P1651LCounter = -1;
         public boolean isIp65504P1651LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1651LCounter != sharedCounter;
            localIp65504P1651LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1651_L_LEN = 2;
  	/**
	 * serializeIp65504P1651L
	 */
	protected void serializeIp65504P1651L(short ip65504P1651L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1651L,IP_65504_P_1651_L_LEN)
                  ,beginIp65504P1651L
                  ,IP_65504_P_1651_L_LEN
                 );
            localIp65504P1651LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1651LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1651L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1651L() {	 
			return (getShort(beginIp65504P1651L));
   	}
         int localIp65504P1652SCounter = -1;
         public boolean isIp65504P1652SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1652SCounter != sharedCounter;
            localIp65504P1652SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1652_S_LEN = 2;
  	/**
	 * serializeIp65504P1652S
	 */
	protected void serializeIp65504P1652S(short ip65504P1652S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1652S,IP_65504_P_1652_S_LEN)
                  ,beginIp65504P1652S
                  ,IP_65504_P_1652_S_LEN
                 );
            localIp65504P1652SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1652SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1652S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1652S() {	 
			return (getShort(beginIp65504P1652S));
   	}
         int localIp65504P1652LCounter = -1;
         public boolean isIp65504P1652LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1652LCounter != sharedCounter;
            localIp65504P1652LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1652_L_LEN = 2;
  	/**
	 * serializeIp65504P1652L
	 */
	protected void serializeIp65504P1652L(short ip65504P1652L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1652L,IP_65504_P_1652_L_LEN)
                  ,beginIp65504P1652L
                  ,IP_65504_P_1652_L_LEN
                 );
            localIp65504P1652LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1652LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1652L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1652L() {	 
			return (getShort(beginIp65504P1652L));
   	}
         int localIp65504P1653SCounter = -1;
         public boolean isIp65504P1653SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1653SCounter != sharedCounter;
            localIp65504P1653SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1653_S_LEN = 2;
  	/**
	 * serializeIp65504P1653S
	 */
	protected void serializeIp65504P1653S(short ip65504P1653S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1653S,IP_65504_P_1653_S_LEN)
                  ,beginIp65504P1653S
                  ,IP_65504_P_1653_S_LEN
                 );
            localIp65504P1653SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1653SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1653S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1653S() {	 
			return (getShort(beginIp65504P1653S));
   	}
         int localIp65504P1653LCounter = -1;
         public boolean isIp65504P1653LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1653LCounter != sharedCounter;
            localIp65504P1653LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1653_L_LEN = 2;
  	/**
	 * serializeIp65504P1653L
	 */
	protected void serializeIp65504P1653L(short ip65504P1653L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1653L,IP_65504_P_1653_L_LEN)
                  ,beginIp65504P1653L
                  ,IP_65504_P_1653_L_LEN
                 );
            localIp65504P1653LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1653LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1653L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1653L() {	 
			return (getShort(beginIp65504P1653L));
   	}
         int localIp65504P1654SCounter = -1;
         public boolean isIp65504P1654SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1654SCounter != sharedCounter;
            localIp65504P1654SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1654_S_LEN = 2;
  	/**
	 * serializeIp65504P1654S
	 */
	protected void serializeIp65504P1654S(short ip65504P1654S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1654S,IP_65504_P_1654_S_LEN)
                  ,beginIp65504P1654S
                  ,IP_65504_P_1654_S_LEN
                 );
            localIp65504P1654SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1654SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1654S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1654S() {	 
			return (getShort(beginIp65504P1654S));
   	}
         int localIp65504P1654LCounter = -1;
         public boolean isIp65504P1654LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1654LCounter != sharedCounter;
            localIp65504P1654LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1654_L_LEN = 2;
  	/**
	 * serializeIp65504P1654L
	 */
	protected void serializeIp65504P1654L(short ip65504P1654L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1654L,IP_65504_P_1654_L_LEN)
                  ,beginIp65504P1654L
                  ,IP_65504_P_1654_L_LEN
                 );
            localIp65504P1654LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1654LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1654L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1654L() {	 
			return (getShort(beginIp65504P1654L));
   	}
         int localIp65504P1655SCounter = -1;
         public boolean isIp65504P1655SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1655SCounter != sharedCounter;
            localIp65504P1655SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1655_S_LEN = 2;
  	/**
	 * serializeIp65504P1655S
	 */
	protected void serializeIp65504P1655S(short ip65504P1655S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1655S,IP_65504_P_1655_S_LEN)
                  ,beginIp65504P1655S
                  ,IP_65504_P_1655_S_LEN
                 );
            localIp65504P1655SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1655SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1655S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1655S() {	 
			return (getShort(beginIp65504P1655S));
   	}
         int localIp65504P1655LCounter = -1;
         public boolean isIp65504P1655LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1655LCounter != sharedCounter;
            localIp65504P1655LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1655_L_LEN = 2;
  	/**
	 * serializeIp65504P1655L
	 */
	protected void serializeIp65504P1655L(short ip65504P1655L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1655L,IP_65504_P_1655_L_LEN)
                  ,beginIp65504P1655L
                  ,IP_65504_P_1655_L_LEN
                 );
            localIp65504P1655LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1655LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1655L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1655L() {	 
			return (getShort(beginIp65504P1655L));
   	}
         int localIp65504P1656SCounter = -1;
         public boolean isIp65504P1656SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1656SCounter != sharedCounter;
            localIp65504P1656SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1656_S_LEN = 2;
  	/**
	 * serializeIp65504P1656S
	 */
	protected void serializeIp65504P1656S(short ip65504P1656S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1656S,IP_65504_P_1656_S_LEN)
                  ,beginIp65504P1656S
                  ,IP_65504_P_1656_S_LEN
                 );
            localIp65504P1656SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1656SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1656S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1656S() {	 
			return (getShort(beginIp65504P1656S));
   	}
         int localIp65504P1656LCounter = -1;
         public boolean isIp65504P1656LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1656LCounter != sharedCounter;
            localIp65504P1656LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1656_L_LEN = 2;
  	/**
	 * serializeIp65504P1656L
	 */
	protected void serializeIp65504P1656L(short ip65504P1656L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1656L,IP_65504_P_1656_L_LEN)
                  ,beginIp65504P1656L
                  ,IP_65504_P_1656_L_LEN
                 );
            localIp65504P1656LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1656LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1656L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1656L() {	 
			return (getShort(beginIp65504P1656L));
   	}
         int localIp65504P1657SCounter = -1;
         public boolean isIp65504P1657SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1657SCounter != sharedCounter;
            localIp65504P1657SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1657_S_LEN = 2;
  	/**
	 * serializeIp65504P1657S
	 */
	protected void serializeIp65504P1657S(short ip65504P1657S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1657S,IP_65504_P_1657_S_LEN)
                  ,beginIp65504P1657S
                  ,IP_65504_P_1657_S_LEN
                 );
            localIp65504P1657SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1657SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1657S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1657S() {	 
			return (getShort(beginIp65504P1657S));
   	}
         int localIp65504P1657LCounter = -1;
         public boolean isIp65504P1657LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1657LCounter != sharedCounter;
            localIp65504P1657LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1657_L_LEN = 2;
  	/**
	 * serializeIp65504P1657L
	 */
	protected void serializeIp65504P1657L(short ip65504P1657L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1657L,IP_65504_P_1657_L_LEN)
                  ,beginIp65504P1657L
                  ,IP_65504_P_1657_L_LEN
                 );
            localIp65504P1657LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1657LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1657L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1657L() {	 
			return (getShort(beginIp65504P1657L));
   	}
         int localIp65504P1658SCounter = -1;
         public boolean isIp65504P1658SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1658SCounter != sharedCounter;
            localIp65504P1658SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1658_S_LEN = 2;
  	/**
	 * serializeIp65504P1658S
	 */
	protected void serializeIp65504P1658S(short ip65504P1658S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1658S,IP_65504_P_1658_S_LEN)
                  ,beginIp65504P1658S
                  ,IP_65504_P_1658_S_LEN
                 );
            localIp65504P1658SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1658SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1658S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1658S() {	 
			return (getShort(beginIp65504P1658S));
   	}
         int localIp65504P1658LCounter = -1;
         public boolean isIp65504P1658LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1658LCounter != sharedCounter;
            localIp65504P1658LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1658_L_LEN = 2;
  	/**
	 * serializeIp65504P1658L
	 */
	protected void serializeIp65504P1658L(short ip65504P1658L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1658L,IP_65504_P_1658_L_LEN)
                  ,beginIp65504P1658L
                  ,IP_65504_P_1658_L_LEN
                 );
            localIp65504P1658LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1658LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1658L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1658L() {	 
			return (getShort(beginIp65504P1658L));
   	}
         int localIp65504P1659SCounter = -1;
         public boolean isIp65504P1659SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1659SCounter != sharedCounter;
            localIp65504P1659SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1659_S_LEN = 2;
  	/**
	 * serializeIp65504P1659S
	 */
	protected void serializeIp65504P1659S(short ip65504P1659S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1659S,IP_65504_P_1659_S_LEN)
                  ,beginIp65504P1659S
                  ,IP_65504_P_1659_S_LEN
                 );
            localIp65504P1659SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1659SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1659S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1659S() {	 
			return (getShort(beginIp65504P1659S));
   	}
         int localIp65504P1659LCounter = -1;
         public boolean isIp65504P1659LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1659LCounter != sharedCounter;
            localIp65504P1659LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1659_L_LEN = 2;
  	/**
	 * serializeIp65504P1659L
	 */
	protected void serializeIp65504P1659L(short ip65504P1659L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1659L,IP_65504_P_1659_L_LEN)
                  ,beginIp65504P1659L
                  ,IP_65504_P_1659_L_LEN
                 );
            localIp65504P1659LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1659LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1659L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1659L() {	 
			return (getShort(beginIp65504P1659L));
   	}
         int localIp65504P1660SCounter = -1;
         public boolean isIp65504P1660SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1660SCounter != sharedCounter;
            localIp65504P1660SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1660_S_LEN = 2;
  	/**
	 * serializeIp65504P1660S
	 */
	protected void serializeIp65504P1660S(short ip65504P1660S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1660S,IP_65504_P_1660_S_LEN)
                  ,beginIp65504P1660S
                  ,IP_65504_P_1660_S_LEN
                 );
            localIp65504P1660SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1660SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1660S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1660S() {	 
			return (getShort(beginIp65504P1660S));
   	}
         int localIp65504P1660LCounter = -1;
         public boolean isIp65504P1660LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1660LCounter != sharedCounter;
            localIp65504P1660LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1660_L_LEN = 2;
  	/**
	 * serializeIp65504P1660L
	 */
	protected void serializeIp65504P1660L(short ip65504P1660L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1660L,IP_65504_P_1660_L_LEN)
                  ,beginIp65504P1660L
                  ,IP_65504_P_1660_L_LEN
                 );
            localIp65504P1660LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1660LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1660L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1660L() {	 
			return (getShort(beginIp65504P1660L));
   	}
         int localIp65504P1661SCounter = -1;
         public boolean isIp65504P1661SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1661SCounter != sharedCounter;
            localIp65504P1661SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1661_S_LEN = 2;
  	/**
	 * serializeIp65504P1661S
	 */
	protected void serializeIp65504P1661S(short ip65504P1661S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1661S,IP_65504_P_1661_S_LEN)
                  ,beginIp65504P1661S
                  ,IP_65504_P_1661_S_LEN
                 );
            localIp65504P1661SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1661SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1661S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1661S() {	 
			return (getShort(beginIp65504P1661S));
   	}
         int localIp65504P1661LCounter = -1;
         public boolean isIp65504P1661LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1661LCounter != sharedCounter;
            localIp65504P1661LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1661_L_LEN = 2;
  	/**
	 * serializeIp65504P1661L
	 */
	protected void serializeIp65504P1661L(short ip65504P1661L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1661L,IP_65504_P_1661_L_LEN)
                  ,beginIp65504P1661L
                  ,IP_65504_P_1661_L_LEN
                 );
            localIp65504P1661LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1661LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1661L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1661L() {	 
			return (getShort(beginIp65504P1661L));
   	}
         int localIp65504P1662SCounter = -1;
         public boolean isIp65504P1662SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1662SCounter != sharedCounter;
            localIp65504P1662SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1662_S_LEN = 2;
  	/**
	 * serializeIp65504P1662S
	 */
	protected void serializeIp65504P1662S(short ip65504P1662S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1662S,IP_65504_P_1662_S_LEN)
                  ,beginIp65504P1662S
                  ,IP_65504_P_1662_S_LEN
                 );
            localIp65504P1662SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1662SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1662S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1662S() {	 
			return (getShort(beginIp65504P1662S));
   	}
         int localIp65504P1662LCounter = -1;
         public boolean isIp65504P1662LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1662LCounter != sharedCounter;
            localIp65504P1662LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1662_L_LEN = 2;
  	/**
	 * serializeIp65504P1662L
	 */
	protected void serializeIp65504P1662L(short ip65504P1662L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1662L,IP_65504_P_1662_L_LEN)
                  ,beginIp65504P1662L
                  ,IP_65504_P_1662_L_LEN
                 );
            localIp65504P1662LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1662LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1662L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1662L() {	 
			return (getShort(beginIp65504P1662L));
   	}
         int localIp65504P1663SCounter = -1;
         public boolean isIp65504P1663SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1663SCounter != sharedCounter;
            localIp65504P1663SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1663_S_LEN = 2;
  	/**
	 * serializeIp65504P1663S
	 */
	protected void serializeIp65504P1663S(short ip65504P1663S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1663S,IP_65504_P_1663_S_LEN)
                  ,beginIp65504P1663S
                  ,IP_65504_P_1663_S_LEN
                 );
            localIp65504P1663SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1663SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1663S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1663S() {	 
			return (getShort(beginIp65504P1663S));
   	}
         int localIp65504P1663LCounter = -1;
         public boolean isIp65504P1663LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1663LCounter != sharedCounter;
            localIp65504P1663LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1663_L_LEN = 2;
  	/**
	 * serializeIp65504P1663L
	 */
	protected void serializeIp65504P1663L(short ip65504P1663L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1663L,IP_65504_P_1663_L_LEN)
                  ,beginIp65504P1663L
                  ,IP_65504_P_1663_L_LEN
                 );
            localIp65504P1663LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1663LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1663L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1663L() {	 
			return (getShort(beginIp65504P1663L));
   	}
         int localIp65504P1664SCounter = -1;
         public boolean isIp65504P1664SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1664SCounter != sharedCounter;
            localIp65504P1664SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1664_S_LEN = 2;
  	/**
	 * serializeIp65504P1664S
	 */
	protected void serializeIp65504P1664S(short ip65504P1664S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1664S,IP_65504_P_1664_S_LEN)
                  ,beginIp65504P1664S
                  ,IP_65504_P_1664_S_LEN
                 );
            localIp65504P1664SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1664SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1664S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1664S() {	 
			return (getShort(beginIp65504P1664S));
   	}
         int localIp65504P1664LCounter = -1;
         public boolean isIp65504P1664LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1664LCounter != sharedCounter;
            localIp65504P1664LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1664_L_LEN = 2;
  	/**
	 * serializeIp65504P1664L
	 */
	protected void serializeIp65504P1664L(short ip65504P1664L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1664L,IP_65504_P_1664_L_LEN)
                  ,beginIp65504P1664L
                  ,IP_65504_P_1664_L_LEN
                 );
            localIp65504P1664LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1664LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1664L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1664L() {	 
			return (getShort(beginIp65504P1664L));
   	}
         int localIp65504P1665SCounter = -1;
         public boolean isIp65504P1665SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1665SCounter != sharedCounter;
            localIp65504P1665SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1665_S_LEN = 2;
  	/**
	 * serializeIp65504P1665S
	 */
	protected void serializeIp65504P1665S(short ip65504P1665S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1665S,IP_65504_P_1665_S_LEN)
                  ,beginIp65504P1665S
                  ,IP_65504_P_1665_S_LEN
                 );
            localIp65504P1665SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1665SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1665S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1665S() {	 
			return (getShort(beginIp65504P1665S));
   	}
         int localIp65504P1665LCounter = -1;
         public boolean isIp65504P1665LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1665LCounter != sharedCounter;
            localIp65504P1665LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1665_L_LEN = 2;
  	/**
	 * serializeIp65504P1665L
	 */
	protected void serializeIp65504P1665L(short ip65504P1665L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1665L,IP_65504_P_1665_L_LEN)
                  ,beginIp65504P1665L
                  ,IP_65504_P_1665_L_LEN
                 );
            localIp65504P1665LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1665LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1665L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1665L() {	 
			return (getShort(beginIp65504P1665L));
   	}
         int localIp65504P1666SCounter = -1;
         public boolean isIp65504P1666SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1666SCounter != sharedCounter;
            localIp65504P1666SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1666_S_LEN = 2;
  	/**
	 * serializeIp65504P1666S
	 */
	protected void serializeIp65504P1666S(short ip65504P1666S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1666S,IP_65504_P_1666_S_LEN)
                  ,beginIp65504P1666S
                  ,IP_65504_P_1666_S_LEN
                 );
            localIp65504P1666SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1666SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1666S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1666S() {	 
			return (getShort(beginIp65504P1666S));
   	}
         int localIp65504P1666LCounter = -1;
         public boolean isIp65504P1666LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1666LCounter != sharedCounter;
            localIp65504P1666LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1666_L_LEN = 2;
  	/**
	 * serializeIp65504P1666L
	 */
	protected void serializeIp65504P1666L(short ip65504P1666L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1666L,IP_65504_P_1666_L_LEN)
                  ,beginIp65504P1666L
                  ,IP_65504_P_1666_L_LEN
                 );
            localIp65504P1666LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1666LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1666L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1666L() {	 
			return (getShort(beginIp65504P1666L));
   	}
         int localIp65504P1667SCounter = -1;
         public boolean isIp65504P1667SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1667SCounter != sharedCounter;
            localIp65504P1667SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1667_S_LEN = 2;
  	/**
	 * serializeIp65504P1667S
	 */
	protected void serializeIp65504P1667S(short ip65504P1667S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1667S,IP_65504_P_1667_S_LEN)
                  ,beginIp65504P1667S
                  ,IP_65504_P_1667_S_LEN
                 );
            localIp65504P1667SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1667SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1667S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1667S() {	 
			return (getShort(beginIp65504P1667S));
   	}
         int localIp65504P1667LCounter = -1;
         public boolean isIp65504P1667LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1667LCounter != sharedCounter;
            localIp65504P1667LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1667_L_LEN = 2;
  	/**
	 * serializeIp65504P1667L
	 */
	protected void serializeIp65504P1667L(short ip65504P1667L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1667L,IP_65504_P_1667_L_LEN)
                  ,beginIp65504P1667L
                  ,IP_65504_P_1667_L_LEN
                 );
            localIp65504P1667LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1667LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1667L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1667L() {	 
			return (getShort(beginIp65504P1667L));
   	}
         int localIp65504P1668SCounter = -1;
         public boolean isIp65504P1668SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1668SCounter != sharedCounter;
            localIp65504P1668SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1668_S_LEN = 2;
  	/**
	 * serializeIp65504P1668S
	 */
	protected void serializeIp65504P1668S(short ip65504P1668S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1668S,IP_65504_P_1668_S_LEN)
                  ,beginIp65504P1668S
                  ,IP_65504_P_1668_S_LEN
                 );
            localIp65504P1668SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1668SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1668S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1668S() {	 
			return (getShort(beginIp65504P1668S));
   	}
         int localIp65504P1668LCounter = -1;
         public boolean isIp65504P1668LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1668LCounter != sharedCounter;
            localIp65504P1668LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1668_L_LEN = 2;
  	/**
	 * serializeIp65504P1668L
	 */
	protected void serializeIp65504P1668L(short ip65504P1668L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1668L,IP_65504_P_1668_L_LEN)
                  ,beginIp65504P1668L
                  ,IP_65504_P_1668_L_LEN
                 );
            localIp65504P1668LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1668LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1668L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1668L() {	 
			return (getShort(beginIp65504P1668L));
   	}
         int localIp65504P1669SCounter = -1;
         public boolean isIp65504P1669SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1669SCounter != sharedCounter;
            localIp65504P1669SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1669_S_LEN = 2;
  	/**
	 * serializeIp65504P1669S
	 */
	protected void serializeIp65504P1669S(short ip65504P1669S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1669S,IP_65504_P_1669_S_LEN)
                  ,beginIp65504P1669S
                  ,IP_65504_P_1669_S_LEN
                 );
            localIp65504P1669SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1669SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1669S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1669S() {	 
			return (getShort(beginIp65504P1669S));
   	}
         int localIp65504P1669LCounter = -1;
         public boolean isIp65504P1669LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1669LCounter != sharedCounter;
            localIp65504P1669LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1669_L_LEN = 2;
  	/**
	 * serializeIp65504P1669L
	 */
	protected void serializeIp65504P1669L(short ip65504P1669L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1669L,IP_65504_P_1669_L_LEN)
                  ,beginIp65504P1669L
                  ,IP_65504_P_1669_L_LEN
                 );
            localIp65504P1669LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1669LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1669L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1669L() {	 
			return (getShort(beginIp65504P1669L));
   	}
         int localIp65504P1670SCounter = -1;
         public boolean isIp65504P1670SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1670SCounter != sharedCounter;
            localIp65504P1670SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1670_S_LEN = 2;
  	/**
	 * serializeIp65504P1670S
	 */
	protected void serializeIp65504P1670S(short ip65504P1670S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1670S,IP_65504_P_1670_S_LEN)
                  ,beginIp65504P1670S
                  ,IP_65504_P_1670_S_LEN
                 );
            localIp65504P1670SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1670SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1670S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1670S() {	 
			return (getShort(beginIp65504P1670S));
   	}
         int localIp65504P1670LCounter = -1;
         public boolean isIp65504P1670LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1670LCounter != sharedCounter;
            localIp65504P1670LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1670_L_LEN = 2;
  	/**
	 * serializeIp65504P1670L
	 */
	protected void serializeIp65504P1670L(short ip65504P1670L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1670L,IP_65504_P_1670_L_LEN)
                  ,beginIp65504P1670L
                  ,IP_65504_P_1670_L_LEN
                 );
            localIp65504P1670LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1670LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1670L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1670L() {	 
			return (getShort(beginIp65504P1670L));
   	}
         int localIp65504P1671SCounter = -1;
         public boolean isIp65504P1671SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1671SCounter != sharedCounter;
            localIp65504P1671SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1671_S_LEN = 2;
  	/**
	 * serializeIp65504P1671S
	 */
	protected void serializeIp65504P1671S(short ip65504P1671S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1671S,IP_65504_P_1671_S_LEN)
                  ,beginIp65504P1671S
                  ,IP_65504_P_1671_S_LEN
                 );
            localIp65504P1671SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1671SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1671S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1671S() {	 
			return (getShort(beginIp65504P1671S));
   	}
         int localIp65504P1671LCounter = -1;
         public boolean isIp65504P1671LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1671LCounter != sharedCounter;
            localIp65504P1671LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1671_L_LEN = 2;
  	/**
	 * serializeIp65504P1671L
	 */
	protected void serializeIp65504P1671L(short ip65504P1671L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1671L,IP_65504_P_1671_L_LEN)
                  ,beginIp65504P1671L
                  ,IP_65504_P_1671_L_LEN
                 );
            localIp65504P1671LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1671LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1671L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1671L() {	 
			return (getShort(beginIp65504P1671L));
   	}
         int localIp65504P1672SCounter = -1;
         public boolean isIp65504P1672SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1672SCounter != sharedCounter;
            localIp65504P1672SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1672_S_LEN = 2;
  	/**
	 * serializeIp65504P1672S
	 */
	protected void serializeIp65504P1672S(short ip65504P1672S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1672S,IP_65504_P_1672_S_LEN)
                  ,beginIp65504P1672S
                  ,IP_65504_P_1672_S_LEN
                 );
            localIp65504P1672SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1672SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1672S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1672S() {	 
			return (getShort(beginIp65504P1672S));
   	}
         int localIp65504P1672LCounter = -1;
         public boolean isIp65504P1672LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1672LCounter != sharedCounter;
            localIp65504P1672LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1672_L_LEN = 2;
  	/**
	 * serializeIp65504P1672L
	 */
	protected void serializeIp65504P1672L(short ip65504P1672L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1672L,IP_65504_P_1672_L_LEN)
                  ,beginIp65504P1672L
                  ,IP_65504_P_1672_L_LEN
                 );
            localIp65504P1672LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1672LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1672L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1672L() {	 
			return (getShort(beginIp65504P1672L));
   	}
         int localIp65504P1673SCounter = -1;
         public boolean isIp65504P1673SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1673SCounter != sharedCounter;
            localIp65504P1673SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1673_S_LEN = 2;
  	/**
	 * serializeIp65504P1673S
	 */
	protected void serializeIp65504P1673S(short ip65504P1673S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1673S,IP_65504_P_1673_S_LEN)
                  ,beginIp65504P1673S
                  ,IP_65504_P_1673_S_LEN
                 );
            localIp65504P1673SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1673SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1673S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1673S() {	 
			return (getShort(beginIp65504P1673S));
   	}
         int localIp65504P1673LCounter = -1;
         public boolean isIp65504P1673LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1673LCounter != sharedCounter;
            localIp65504P1673LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1673_L_LEN = 2;
  	/**
	 * serializeIp65504P1673L
	 */
	protected void serializeIp65504P1673L(short ip65504P1673L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1673L,IP_65504_P_1673_L_LEN)
                  ,beginIp65504P1673L
                  ,IP_65504_P_1673_L_LEN
                 );
            localIp65504P1673LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1673LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1673L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1673L() {	 
			return (getShort(beginIp65504P1673L));
   	}
         int localIp65504P1674SCounter = -1;
         public boolean isIp65504P1674SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1674SCounter != sharedCounter;
            localIp65504P1674SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1674_S_LEN = 2;
  	/**
	 * serializeIp65504P1674S
	 */
	protected void serializeIp65504P1674S(short ip65504P1674S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1674S,IP_65504_P_1674_S_LEN)
                  ,beginIp65504P1674S
                  ,IP_65504_P_1674_S_LEN
                 );
            localIp65504P1674SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1674SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1674S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1674S() {	 
			return (getShort(beginIp65504P1674S));
   	}
         int localIp65504P1674LCounter = -1;
         public boolean isIp65504P1674LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1674LCounter != sharedCounter;
            localIp65504P1674LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1674_L_LEN = 2;
  	/**
	 * serializeIp65504P1674L
	 */
	protected void serializeIp65504P1674L(short ip65504P1674L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1674L,IP_65504_P_1674_L_LEN)
                  ,beginIp65504P1674L
                  ,IP_65504_P_1674_L_LEN
                 );
            localIp65504P1674LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1674LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1674L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1674L() {	 
			return (getShort(beginIp65504P1674L));
   	}




}
  
