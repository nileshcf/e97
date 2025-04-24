package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup91Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup91Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup91Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_91_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2791S;
            protected  int beginIp65504P2791L;
            protected  int beginIp65504P2792S;
            protected  int beginIp65504P2792L;
            protected  int beginIp65504P2793S;
            protected  int beginIp65504P2793L;
            protected  int beginIp65504P2794S;
            protected  int beginIp65504P2794L;
            protected  int beginIp65504P2795S;
            protected  int beginIp65504P2795L;
            protected  int beginIp65504P2796S;
            protected  int beginIp65504P2796L;
            protected  int beginIp65504P2797S;
            protected  int beginIp65504P2797L;
            protected  int beginIp65504P2798S;
            protected  int beginIp65504P2798L;
            protected  int beginIp65504P2799S;
            protected  int beginIp65504P2799L;
            protected  int beginIp65504P2800S;
            protected  int beginIp65504P2800L;
            protected  int beginIp65504P2801S;
            protected  int beginIp65504P2801L;
            protected  int beginIp65504P2802S;
            protected  int beginIp65504P2802L;
            protected  int beginIp65504P2803S;
            protected  int beginIp65504P2803L;
            protected  int beginIp65504P2804S;
            protected  int beginIp65504P2804L;
            protected  int beginIp65504P2805S;
            protected  int beginIp65504P2805L;
            protected  int beginIp65504P2806S;
            protected  int beginIp65504P2806L;
            protected  int beginIp65504P2807S;
            protected  int beginIp65504P2807L;
            protected  int beginIp65504P2808S;
            protected  int beginIp65504P2808L;
            protected  int beginIp65504P2809S;
            protected  int beginIp65504P2809L;
            protected  int beginIp65504P2810S;
            protected  int beginIp65504P2810L;
            protected  int beginIp65504P2811S;
            protected  int beginIp65504P2811L;
            protected  int beginIp65504P2812S;
            protected  int beginIp65504P2812L;
            protected  int beginIp65504P2813S;
            protected  int beginIp65504P2813L;
            protected  int beginIp65504P2814S;
            protected  int beginIp65504P2814L;
            protected  int beginIp65504P2815S;
            protected  int beginIp65504P2815L;
            protected  int beginIp65504P2816S;
            protected  int beginIp65504P2816L;
            protected  int beginIp65504P2817S;
            protected  int beginIp65504P2817L;
            protected  int beginIp65504P2818S;
            protected  int beginIp65504P2818L;
            protected  int beginIp65504P2819S;
            protected  int beginIp65504P2819L;
            protected  int beginIp65504P2820S;
            protected  int beginIp65504P2820L;
            protected  int beginIp65504P2821S;
            protected  int beginIp65504P2821L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup91Serialized
	**/
    public Ip65504PdsNamesLargeGroup91Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup91Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup91Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup91Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22316); // serialize this field at offset 22316 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup91Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22316 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup91Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_91_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2791S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2791L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2792S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2792L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2793S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2793L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2794S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2794L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2795S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2795L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2796S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2796L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2797S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2797L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2798S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2798L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2799S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2799L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2800S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2800L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2801S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2801L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2802S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2802L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2803S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2803L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2804S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2804L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2805S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2805L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2806S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2806L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2807S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2807L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2808S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2808L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2809S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2809L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2810S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2810L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2811S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2811L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2812S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2812L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2813S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2813L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2814S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2814L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2815S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2815L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2816S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2816L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2817S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2817L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2818S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2818L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2819S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2819L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2820S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2820L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2821S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2821L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2791SCounter = -1;
         public boolean isIp65504P2791SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2791SCounter != sharedCounter;
            localIp65504P2791SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2791_S_LEN = 2;
  	/**
	 * serializeIp65504P2791S
	 */
	protected void serializeIp65504P2791S(short ip65504P2791S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2791S,IP_65504_P_2791_S_LEN)
                  ,beginIp65504P2791S
                  ,IP_65504_P_2791_S_LEN
                 );
            localIp65504P2791SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2791SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2791S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2791S() {	 
			return (getShort(beginIp65504P2791S));
   	}
         int localIp65504P2791LCounter = -1;
         public boolean isIp65504P2791LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2791LCounter != sharedCounter;
            localIp65504P2791LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2791_L_LEN = 2;
  	/**
	 * serializeIp65504P2791L
	 */
	protected void serializeIp65504P2791L(short ip65504P2791L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2791L,IP_65504_P_2791_L_LEN)
                  ,beginIp65504P2791L
                  ,IP_65504_P_2791_L_LEN
                 );
            localIp65504P2791LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2791LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2791L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2791L() {	 
			return (getShort(beginIp65504P2791L));
   	}
         int localIp65504P2792SCounter = -1;
         public boolean isIp65504P2792SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2792SCounter != sharedCounter;
            localIp65504P2792SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2792_S_LEN = 2;
  	/**
	 * serializeIp65504P2792S
	 */
	protected void serializeIp65504P2792S(short ip65504P2792S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2792S,IP_65504_P_2792_S_LEN)
                  ,beginIp65504P2792S
                  ,IP_65504_P_2792_S_LEN
                 );
            localIp65504P2792SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2792SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2792S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2792S() {	 
			return (getShort(beginIp65504P2792S));
   	}
         int localIp65504P2792LCounter = -1;
         public boolean isIp65504P2792LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2792LCounter != sharedCounter;
            localIp65504P2792LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2792_L_LEN = 2;
  	/**
	 * serializeIp65504P2792L
	 */
	protected void serializeIp65504P2792L(short ip65504P2792L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2792L,IP_65504_P_2792_L_LEN)
                  ,beginIp65504P2792L
                  ,IP_65504_P_2792_L_LEN
                 );
            localIp65504P2792LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2792LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2792L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2792L() {	 
			return (getShort(beginIp65504P2792L));
   	}
         int localIp65504P2793SCounter = -1;
         public boolean isIp65504P2793SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2793SCounter != sharedCounter;
            localIp65504P2793SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2793_S_LEN = 2;
  	/**
	 * serializeIp65504P2793S
	 */
	protected void serializeIp65504P2793S(short ip65504P2793S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2793S,IP_65504_P_2793_S_LEN)
                  ,beginIp65504P2793S
                  ,IP_65504_P_2793_S_LEN
                 );
            localIp65504P2793SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2793SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2793S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2793S() {	 
			return (getShort(beginIp65504P2793S));
   	}
         int localIp65504P2793LCounter = -1;
         public boolean isIp65504P2793LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2793LCounter != sharedCounter;
            localIp65504P2793LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2793_L_LEN = 2;
  	/**
	 * serializeIp65504P2793L
	 */
	protected void serializeIp65504P2793L(short ip65504P2793L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2793L,IP_65504_P_2793_L_LEN)
                  ,beginIp65504P2793L
                  ,IP_65504_P_2793_L_LEN
                 );
            localIp65504P2793LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2793LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2793L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2793L() {	 
			return (getShort(beginIp65504P2793L));
   	}
         int localIp65504P2794SCounter = -1;
         public boolean isIp65504P2794SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2794SCounter != sharedCounter;
            localIp65504P2794SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2794_S_LEN = 2;
  	/**
	 * serializeIp65504P2794S
	 */
	protected void serializeIp65504P2794S(short ip65504P2794S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2794S,IP_65504_P_2794_S_LEN)
                  ,beginIp65504P2794S
                  ,IP_65504_P_2794_S_LEN
                 );
            localIp65504P2794SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2794SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2794S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2794S() {	 
			return (getShort(beginIp65504P2794S));
   	}
         int localIp65504P2794LCounter = -1;
         public boolean isIp65504P2794LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2794LCounter != sharedCounter;
            localIp65504P2794LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2794_L_LEN = 2;
  	/**
	 * serializeIp65504P2794L
	 */
	protected void serializeIp65504P2794L(short ip65504P2794L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2794L,IP_65504_P_2794_L_LEN)
                  ,beginIp65504P2794L
                  ,IP_65504_P_2794_L_LEN
                 );
            localIp65504P2794LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2794LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2794L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2794L() {	 
			return (getShort(beginIp65504P2794L));
   	}
         int localIp65504P2795SCounter = -1;
         public boolean isIp65504P2795SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2795SCounter != sharedCounter;
            localIp65504P2795SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2795_S_LEN = 2;
  	/**
	 * serializeIp65504P2795S
	 */
	protected void serializeIp65504P2795S(short ip65504P2795S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2795S,IP_65504_P_2795_S_LEN)
                  ,beginIp65504P2795S
                  ,IP_65504_P_2795_S_LEN
                 );
            localIp65504P2795SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2795SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2795S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2795S() {	 
			return (getShort(beginIp65504P2795S));
   	}
         int localIp65504P2795LCounter = -1;
         public boolean isIp65504P2795LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2795LCounter != sharedCounter;
            localIp65504P2795LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2795_L_LEN = 2;
  	/**
	 * serializeIp65504P2795L
	 */
	protected void serializeIp65504P2795L(short ip65504P2795L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2795L,IP_65504_P_2795_L_LEN)
                  ,beginIp65504P2795L
                  ,IP_65504_P_2795_L_LEN
                 );
            localIp65504P2795LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2795LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2795L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2795L() {	 
			return (getShort(beginIp65504P2795L));
   	}
         int localIp65504P2796SCounter = -1;
         public boolean isIp65504P2796SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2796SCounter != sharedCounter;
            localIp65504P2796SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2796_S_LEN = 2;
  	/**
	 * serializeIp65504P2796S
	 */
	protected void serializeIp65504P2796S(short ip65504P2796S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2796S,IP_65504_P_2796_S_LEN)
                  ,beginIp65504P2796S
                  ,IP_65504_P_2796_S_LEN
                 );
            localIp65504P2796SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2796SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2796S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2796S() {	 
			return (getShort(beginIp65504P2796S));
   	}
         int localIp65504P2796LCounter = -1;
         public boolean isIp65504P2796LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2796LCounter != sharedCounter;
            localIp65504P2796LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2796_L_LEN = 2;
  	/**
	 * serializeIp65504P2796L
	 */
	protected void serializeIp65504P2796L(short ip65504P2796L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2796L,IP_65504_P_2796_L_LEN)
                  ,beginIp65504P2796L
                  ,IP_65504_P_2796_L_LEN
                 );
            localIp65504P2796LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2796LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2796L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2796L() {	 
			return (getShort(beginIp65504P2796L));
   	}
         int localIp65504P2797SCounter = -1;
         public boolean isIp65504P2797SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2797SCounter != sharedCounter;
            localIp65504P2797SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2797_S_LEN = 2;
  	/**
	 * serializeIp65504P2797S
	 */
	protected void serializeIp65504P2797S(short ip65504P2797S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2797S,IP_65504_P_2797_S_LEN)
                  ,beginIp65504P2797S
                  ,IP_65504_P_2797_S_LEN
                 );
            localIp65504P2797SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2797SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2797S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2797S() {	 
			return (getShort(beginIp65504P2797S));
   	}
         int localIp65504P2797LCounter = -1;
         public boolean isIp65504P2797LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2797LCounter != sharedCounter;
            localIp65504P2797LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2797_L_LEN = 2;
  	/**
	 * serializeIp65504P2797L
	 */
	protected void serializeIp65504P2797L(short ip65504P2797L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2797L,IP_65504_P_2797_L_LEN)
                  ,beginIp65504P2797L
                  ,IP_65504_P_2797_L_LEN
                 );
            localIp65504P2797LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2797LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2797L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2797L() {	 
			return (getShort(beginIp65504P2797L));
   	}
         int localIp65504P2798SCounter = -1;
         public boolean isIp65504P2798SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2798SCounter != sharedCounter;
            localIp65504P2798SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2798_S_LEN = 2;
  	/**
	 * serializeIp65504P2798S
	 */
	protected void serializeIp65504P2798S(short ip65504P2798S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2798S,IP_65504_P_2798_S_LEN)
                  ,beginIp65504P2798S
                  ,IP_65504_P_2798_S_LEN
                 );
            localIp65504P2798SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2798SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2798S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2798S() {	 
			return (getShort(beginIp65504P2798S));
   	}
         int localIp65504P2798LCounter = -1;
         public boolean isIp65504P2798LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2798LCounter != sharedCounter;
            localIp65504P2798LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2798_L_LEN = 2;
  	/**
	 * serializeIp65504P2798L
	 */
	protected void serializeIp65504P2798L(short ip65504P2798L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2798L,IP_65504_P_2798_L_LEN)
                  ,beginIp65504P2798L
                  ,IP_65504_P_2798_L_LEN
                 );
            localIp65504P2798LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2798LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2798L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2798L() {	 
			return (getShort(beginIp65504P2798L));
   	}
         int localIp65504P2799SCounter = -1;
         public boolean isIp65504P2799SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2799SCounter != sharedCounter;
            localIp65504P2799SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2799_S_LEN = 2;
  	/**
	 * serializeIp65504P2799S
	 */
	protected void serializeIp65504P2799S(short ip65504P2799S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2799S,IP_65504_P_2799_S_LEN)
                  ,beginIp65504P2799S
                  ,IP_65504_P_2799_S_LEN
                 );
            localIp65504P2799SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2799SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2799S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2799S() {	 
			return (getShort(beginIp65504P2799S));
   	}
         int localIp65504P2799LCounter = -1;
         public boolean isIp65504P2799LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2799LCounter != sharedCounter;
            localIp65504P2799LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2799_L_LEN = 2;
  	/**
	 * serializeIp65504P2799L
	 */
	protected void serializeIp65504P2799L(short ip65504P2799L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2799L,IP_65504_P_2799_L_LEN)
                  ,beginIp65504P2799L
                  ,IP_65504_P_2799_L_LEN
                 );
            localIp65504P2799LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2799LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2799L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2799L() {	 
			return (getShort(beginIp65504P2799L));
   	}
         int localIp65504P2800SCounter = -1;
         public boolean isIp65504P2800SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2800SCounter != sharedCounter;
            localIp65504P2800SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2800_S_LEN = 2;
  	/**
	 * serializeIp65504P2800S
	 */
	protected void serializeIp65504P2800S(short ip65504P2800S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2800S,IP_65504_P_2800_S_LEN)
                  ,beginIp65504P2800S
                  ,IP_65504_P_2800_S_LEN
                 );
            localIp65504P2800SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2800SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2800S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2800S() {	 
			return (getShort(beginIp65504P2800S));
   	}
         int localIp65504P2800LCounter = -1;
         public boolean isIp65504P2800LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2800LCounter != sharedCounter;
            localIp65504P2800LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2800_L_LEN = 2;
  	/**
	 * serializeIp65504P2800L
	 */
	protected void serializeIp65504P2800L(short ip65504P2800L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2800L,IP_65504_P_2800_L_LEN)
                  ,beginIp65504P2800L
                  ,IP_65504_P_2800_L_LEN
                 );
            localIp65504P2800LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2800LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2800L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2800L() {	 
			return (getShort(beginIp65504P2800L));
   	}
         int localIp65504P2801SCounter = -1;
         public boolean isIp65504P2801SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2801SCounter != sharedCounter;
            localIp65504P2801SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2801_S_LEN = 2;
  	/**
	 * serializeIp65504P2801S
	 */
	protected void serializeIp65504P2801S(short ip65504P2801S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2801S,IP_65504_P_2801_S_LEN)
                  ,beginIp65504P2801S
                  ,IP_65504_P_2801_S_LEN
                 );
            localIp65504P2801SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2801SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2801S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2801S() {	 
			return (getShort(beginIp65504P2801S));
   	}
         int localIp65504P2801LCounter = -1;
         public boolean isIp65504P2801LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2801LCounter != sharedCounter;
            localIp65504P2801LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2801_L_LEN = 2;
  	/**
	 * serializeIp65504P2801L
	 */
	protected void serializeIp65504P2801L(short ip65504P2801L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2801L,IP_65504_P_2801_L_LEN)
                  ,beginIp65504P2801L
                  ,IP_65504_P_2801_L_LEN
                 );
            localIp65504P2801LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2801LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2801L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2801L() {	 
			return (getShort(beginIp65504P2801L));
   	}
         int localIp65504P2802SCounter = -1;
         public boolean isIp65504P2802SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2802SCounter != sharedCounter;
            localIp65504P2802SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2802_S_LEN = 2;
  	/**
	 * serializeIp65504P2802S
	 */
	protected void serializeIp65504P2802S(short ip65504P2802S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2802S,IP_65504_P_2802_S_LEN)
                  ,beginIp65504P2802S
                  ,IP_65504_P_2802_S_LEN
                 );
            localIp65504P2802SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2802SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2802S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2802S() {	 
			return (getShort(beginIp65504P2802S));
   	}
         int localIp65504P2802LCounter = -1;
         public boolean isIp65504P2802LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2802LCounter != sharedCounter;
            localIp65504P2802LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2802_L_LEN = 2;
  	/**
	 * serializeIp65504P2802L
	 */
	protected void serializeIp65504P2802L(short ip65504P2802L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2802L,IP_65504_P_2802_L_LEN)
                  ,beginIp65504P2802L
                  ,IP_65504_P_2802_L_LEN
                 );
            localIp65504P2802LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2802LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2802L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2802L() {	 
			return (getShort(beginIp65504P2802L));
   	}
         int localIp65504P2803SCounter = -1;
         public boolean isIp65504P2803SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2803SCounter != sharedCounter;
            localIp65504P2803SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2803_S_LEN = 2;
  	/**
	 * serializeIp65504P2803S
	 */
	protected void serializeIp65504P2803S(short ip65504P2803S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2803S,IP_65504_P_2803_S_LEN)
                  ,beginIp65504P2803S
                  ,IP_65504_P_2803_S_LEN
                 );
            localIp65504P2803SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2803SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2803S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2803S() {	 
			return (getShort(beginIp65504P2803S));
   	}
         int localIp65504P2803LCounter = -1;
         public boolean isIp65504P2803LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2803LCounter != sharedCounter;
            localIp65504P2803LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2803_L_LEN = 2;
  	/**
	 * serializeIp65504P2803L
	 */
	protected void serializeIp65504P2803L(short ip65504P2803L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2803L,IP_65504_P_2803_L_LEN)
                  ,beginIp65504P2803L
                  ,IP_65504_P_2803_L_LEN
                 );
            localIp65504P2803LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2803LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2803L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2803L() {	 
			return (getShort(beginIp65504P2803L));
   	}
         int localIp65504P2804SCounter = -1;
         public boolean isIp65504P2804SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2804SCounter != sharedCounter;
            localIp65504P2804SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2804_S_LEN = 2;
  	/**
	 * serializeIp65504P2804S
	 */
	protected void serializeIp65504P2804S(short ip65504P2804S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2804S,IP_65504_P_2804_S_LEN)
                  ,beginIp65504P2804S
                  ,IP_65504_P_2804_S_LEN
                 );
            localIp65504P2804SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2804SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2804S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2804S() {	 
			return (getShort(beginIp65504P2804S));
   	}
         int localIp65504P2804LCounter = -1;
         public boolean isIp65504P2804LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2804LCounter != sharedCounter;
            localIp65504P2804LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2804_L_LEN = 2;
  	/**
	 * serializeIp65504P2804L
	 */
	protected void serializeIp65504P2804L(short ip65504P2804L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2804L,IP_65504_P_2804_L_LEN)
                  ,beginIp65504P2804L
                  ,IP_65504_P_2804_L_LEN
                 );
            localIp65504P2804LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2804LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2804L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2804L() {	 
			return (getShort(beginIp65504P2804L));
   	}
         int localIp65504P2805SCounter = -1;
         public boolean isIp65504P2805SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2805SCounter != sharedCounter;
            localIp65504P2805SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2805_S_LEN = 2;
  	/**
	 * serializeIp65504P2805S
	 */
	protected void serializeIp65504P2805S(short ip65504P2805S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2805S,IP_65504_P_2805_S_LEN)
                  ,beginIp65504P2805S
                  ,IP_65504_P_2805_S_LEN
                 );
            localIp65504P2805SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2805SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2805S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2805S() {	 
			return (getShort(beginIp65504P2805S));
   	}
         int localIp65504P2805LCounter = -1;
         public boolean isIp65504P2805LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2805LCounter != sharedCounter;
            localIp65504P2805LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2805_L_LEN = 2;
  	/**
	 * serializeIp65504P2805L
	 */
	protected void serializeIp65504P2805L(short ip65504P2805L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2805L,IP_65504_P_2805_L_LEN)
                  ,beginIp65504P2805L
                  ,IP_65504_P_2805_L_LEN
                 );
            localIp65504P2805LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2805LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2805L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2805L() {	 
			return (getShort(beginIp65504P2805L));
   	}
         int localIp65504P2806SCounter = -1;
         public boolean isIp65504P2806SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2806SCounter != sharedCounter;
            localIp65504P2806SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2806_S_LEN = 2;
  	/**
	 * serializeIp65504P2806S
	 */
	protected void serializeIp65504P2806S(short ip65504P2806S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2806S,IP_65504_P_2806_S_LEN)
                  ,beginIp65504P2806S
                  ,IP_65504_P_2806_S_LEN
                 );
            localIp65504P2806SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2806SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2806S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2806S() {	 
			return (getShort(beginIp65504P2806S));
   	}
         int localIp65504P2806LCounter = -1;
         public boolean isIp65504P2806LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2806LCounter != sharedCounter;
            localIp65504P2806LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2806_L_LEN = 2;
  	/**
	 * serializeIp65504P2806L
	 */
	protected void serializeIp65504P2806L(short ip65504P2806L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2806L,IP_65504_P_2806_L_LEN)
                  ,beginIp65504P2806L
                  ,IP_65504_P_2806_L_LEN
                 );
            localIp65504P2806LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2806LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2806L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2806L() {	 
			return (getShort(beginIp65504P2806L));
   	}
         int localIp65504P2807SCounter = -1;
         public boolean isIp65504P2807SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2807SCounter != sharedCounter;
            localIp65504P2807SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2807_S_LEN = 2;
  	/**
	 * serializeIp65504P2807S
	 */
	protected void serializeIp65504P2807S(short ip65504P2807S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2807S,IP_65504_P_2807_S_LEN)
                  ,beginIp65504P2807S
                  ,IP_65504_P_2807_S_LEN
                 );
            localIp65504P2807SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2807SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2807S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2807S() {	 
			return (getShort(beginIp65504P2807S));
   	}
         int localIp65504P2807LCounter = -1;
         public boolean isIp65504P2807LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2807LCounter != sharedCounter;
            localIp65504P2807LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2807_L_LEN = 2;
  	/**
	 * serializeIp65504P2807L
	 */
	protected void serializeIp65504P2807L(short ip65504P2807L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2807L,IP_65504_P_2807_L_LEN)
                  ,beginIp65504P2807L
                  ,IP_65504_P_2807_L_LEN
                 );
            localIp65504P2807LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2807LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2807L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2807L() {	 
			return (getShort(beginIp65504P2807L));
   	}
         int localIp65504P2808SCounter = -1;
         public boolean isIp65504P2808SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2808SCounter != sharedCounter;
            localIp65504P2808SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2808_S_LEN = 2;
  	/**
	 * serializeIp65504P2808S
	 */
	protected void serializeIp65504P2808S(short ip65504P2808S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2808S,IP_65504_P_2808_S_LEN)
                  ,beginIp65504P2808S
                  ,IP_65504_P_2808_S_LEN
                 );
            localIp65504P2808SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2808SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2808S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2808S() {	 
			return (getShort(beginIp65504P2808S));
   	}
         int localIp65504P2808LCounter = -1;
         public boolean isIp65504P2808LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2808LCounter != sharedCounter;
            localIp65504P2808LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2808_L_LEN = 2;
  	/**
	 * serializeIp65504P2808L
	 */
	protected void serializeIp65504P2808L(short ip65504P2808L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2808L,IP_65504_P_2808_L_LEN)
                  ,beginIp65504P2808L
                  ,IP_65504_P_2808_L_LEN
                 );
            localIp65504P2808LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2808LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2808L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2808L() {	 
			return (getShort(beginIp65504P2808L));
   	}
         int localIp65504P2809SCounter = -1;
         public boolean isIp65504P2809SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2809SCounter != sharedCounter;
            localIp65504P2809SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2809_S_LEN = 2;
  	/**
	 * serializeIp65504P2809S
	 */
	protected void serializeIp65504P2809S(short ip65504P2809S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2809S,IP_65504_P_2809_S_LEN)
                  ,beginIp65504P2809S
                  ,IP_65504_P_2809_S_LEN
                 );
            localIp65504P2809SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2809SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2809S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2809S() {	 
			return (getShort(beginIp65504P2809S));
   	}
         int localIp65504P2809LCounter = -1;
         public boolean isIp65504P2809LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2809LCounter != sharedCounter;
            localIp65504P2809LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2809_L_LEN = 2;
  	/**
	 * serializeIp65504P2809L
	 */
	protected void serializeIp65504P2809L(short ip65504P2809L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2809L,IP_65504_P_2809_L_LEN)
                  ,beginIp65504P2809L
                  ,IP_65504_P_2809_L_LEN
                 );
            localIp65504P2809LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2809LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2809L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2809L() {	 
			return (getShort(beginIp65504P2809L));
   	}
         int localIp65504P2810SCounter = -1;
         public boolean isIp65504P2810SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2810SCounter != sharedCounter;
            localIp65504P2810SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2810_S_LEN = 2;
  	/**
	 * serializeIp65504P2810S
	 */
	protected void serializeIp65504P2810S(short ip65504P2810S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2810S,IP_65504_P_2810_S_LEN)
                  ,beginIp65504P2810S
                  ,IP_65504_P_2810_S_LEN
                 );
            localIp65504P2810SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2810SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2810S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2810S() {	 
			return (getShort(beginIp65504P2810S));
   	}
         int localIp65504P2810LCounter = -1;
         public boolean isIp65504P2810LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2810LCounter != sharedCounter;
            localIp65504P2810LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2810_L_LEN = 2;
  	/**
	 * serializeIp65504P2810L
	 */
	protected void serializeIp65504P2810L(short ip65504P2810L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2810L,IP_65504_P_2810_L_LEN)
                  ,beginIp65504P2810L
                  ,IP_65504_P_2810_L_LEN
                 );
            localIp65504P2810LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2810LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2810L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2810L() {	 
			return (getShort(beginIp65504P2810L));
   	}
         int localIp65504P2811SCounter = -1;
         public boolean isIp65504P2811SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2811SCounter != sharedCounter;
            localIp65504P2811SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2811_S_LEN = 2;
  	/**
	 * serializeIp65504P2811S
	 */
	protected void serializeIp65504P2811S(short ip65504P2811S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2811S,IP_65504_P_2811_S_LEN)
                  ,beginIp65504P2811S
                  ,IP_65504_P_2811_S_LEN
                 );
            localIp65504P2811SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2811SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2811S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2811S() {	 
			return (getShort(beginIp65504P2811S));
   	}
         int localIp65504P2811LCounter = -1;
         public boolean isIp65504P2811LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2811LCounter != sharedCounter;
            localIp65504P2811LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2811_L_LEN = 2;
  	/**
	 * serializeIp65504P2811L
	 */
	protected void serializeIp65504P2811L(short ip65504P2811L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2811L,IP_65504_P_2811_L_LEN)
                  ,beginIp65504P2811L
                  ,IP_65504_P_2811_L_LEN
                 );
            localIp65504P2811LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2811LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2811L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2811L() {	 
			return (getShort(beginIp65504P2811L));
   	}
         int localIp65504P2812SCounter = -1;
         public boolean isIp65504P2812SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2812SCounter != sharedCounter;
            localIp65504P2812SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2812_S_LEN = 2;
  	/**
	 * serializeIp65504P2812S
	 */
	protected void serializeIp65504P2812S(short ip65504P2812S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2812S,IP_65504_P_2812_S_LEN)
                  ,beginIp65504P2812S
                  ,IP_65504_P_2812_S_LEN
                 );
            localIp65504P2812SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2812SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2812S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2812S() {	 
			return (getShort(beginIp65504P2812S));
   	}
         int localIp65504P2812LCounter = -1;
         public boolean isIp65504P2812LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2812LCounter != sharedCounter;
            localIp65504P2812LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2812_L_LEN = 2;
  	/**
	 * serializeIp65504P2812L
	 */
	protected void serializeIp65504P2812L(short ip65504P2812L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2812L,IP_65504_P_2812_L_LEN)
                  ,beginIp65504P2812L
                  ,IP_65504_P_2812_L_LEN
                 );
            localIp65504P2812LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2812LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2812L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2812L() {	 
			return (getShort(beginIp65504P2812L));
   	}
         int localIp65504P2813SCounter = -1;
         public boolean isIp65504P2813SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2813SCounter != sharedCounter;
            localIp65504P2813SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2813_S_LEN = 2;
  	/**
	 * serializeIp65504P2813S
	 */
	protected void serializeIp65504P2813S(short ip65504P2813S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2813S,IP_65504_P_2813_S_LEN)
                  ,beginIp65504P2813S
                  ,IP_65504_P_2813_S_LEN
                 );
            localIp65504P2813SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2813SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2813S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2813S() {	 
			return (getShort(beginIp65504P2813S));
   	}
         int localIp65504P2813LCounter = -1;
         public boolean isIp65504P2813LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2813LCounter != sharedCounter;
            localIp65504P2813LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2813_L_LEN = 2;
  	/**
	 * serializeIp65504P2813L
	 */
	protected void serializeIp65504P2813L(short ip65504P2813L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2813L,IP_65504_P_2813_L_LEN)
                  ,beginIp65504P2813L
                  ,IP_65504_P_2813_L_LEN
                 );
            localIp65504P2813LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2813LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2813L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2813L() {	 
			return (getShort(beginIp65504P2813L));
   	}
         int localIp65504P2814SCounter = -1;
         public boolean isIp65504P2814SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2814SCounter != sharedCounter;
            localIp65504P2814SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2814_S_LEN = 2;
  	/**
	 * serializeIp65504P2814S
	 */
	protected void serializeIp65504P2814S(short ip65504P2814S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2814S,IP_65504_P_2814_S_LEN)
                  ,beginIp65504P2814S
                  ,IP_65504_P_2814_S_LEN
                 );
            localIp65504P2814SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2814SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2814S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2814S() {	 
			return (getShort(beginIp65504P2814S));
   	}
         int localIp65504P2814LCounter = -1;
         public boolean isIp65504P2814LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2814LCounter != sharedCounter;
            localIp65504P2814LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2814_L_LEN = 2;
  	/**
	 * serializeIp65504P2814L
	 */
	protected void serializeIp65504P2814L(short ip65504P2814L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2814L,IP_65504_P_2814_L_LEN)
                  ,beginIp65504P2814L
                  ,IP_65504_P_2814_L_LEN
                 );
            localIp65504P2814LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2814LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2814L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2814L() {	 
			return (getShort(beginIp65504P2814L));
   	}
         int localIp65504P2815SCounter = -1;
         public boolean isIp65504P2815SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2815SCounter != sharedCounter;
            localIp65504P2815SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2815_S_LEN = 2;
  	/**
	 * serializeIp65504P2815S
	 */
	protected void serializeIp65504P2815S(short ip65504P2815S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2815S,IP_65504_P_2815_S_LEN)
                  ,beginIp65504P2815S
                  ,IP_65504_P_2815_S_LEN
                 );
            localIp65504P2815SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2815SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2815S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2815S() {	 
			return (getShort(beginIp65504P2815S));
   	}
         int localIp65504P2815LCounter = -1;
         public boolean isIp65504P2815LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2815LCounter != sharedCounter;
            localIp65504P2815LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2815_L_LEN = 2;
  	/**
	 * serializeIp65504P2815L
	 */
	protected void serializeIp65504P2815L(short ip65504P2815L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2815L,IP_65504_P_2815_L_LEN)
                  ,beginIp65504P2815L
                  ,IP_65504_P_2815_L_LEN
                 );
            localIp65504P2815LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2815LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2815L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2815L() {	 
			return (getShort(beginIp65504P2815L));
   	}
         int localIp65504P2816SCounter = -1;
         public boolean isIp65504P2816SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2816SCounter != sharedCounter;
            localIp65504P2816SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2816_S_LEN = 2;
  	/**
	 * serializeIp65504P2816S
	 */
	protected void serializeIp65504P2816S(short ip65504P2816S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2816S,IP_65504_P_2816_S_LEN)
                  ,beginIp65504P2816S
                  ,IP_65504_P_2816_S_LEN
                 );
            localIp65504P2816SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2816SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2816S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2816S() {	 
			return (getShort(beginIp65504P2816S));
   	}
         int localIp65504P2816LCounter = -1;
         public boolean isIp65504P2816LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2816LCounter != sharedCounter;
            localIp65504P2816LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2816_L_LEN = 2;
  	/**
	 * serializeIp65504P2816L
	 */
	protected void serializeIp65504P2816L(short ip65504P2816L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2816L,IP_65504_P_2816_L_LEN)
                  ,beginIp65504P2816L
                  ,IP_65504_P_2816_L_LEN
                 );
            localIp65504P2816LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2816LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2816L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2816L() {	 
			return (getShort(beginIp65504P2816L));
   	}
         int localIp65504P2817SCounter = -1;
         public boolean isIp65504P2817SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2817SCounter != sharedCounter;
            localIp65504P2817SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2817_S_LEN = 2;
  	/**
	 * serializeIp65504P2817S
	 */
	protected void serializeIp65504P2817S(short ip65504P2817S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2817S,IP_65504_P_2817_S_LEN)
                  ,beginIp65504P2817S
                  ,IP_65504_P_2817_S_LEN
                 );
            localIp65504P2817SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2817SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2817S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2817S() {	 
			return (getShort(beginIp65504P2817S));
   	}
         int localIp65504P2817LCounter = -1;
         public boolean isIp65504P2817LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2817LCounter != sharedCounter;
            localIp65504P2817LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2817_L_LEN = 2;
  	/**
	 * serializeIp65504P2817L
	 */
	protected void serializeIp65504P2817L(short ip65504P2817L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2817L,IP_65504_P_2817_L_LEN)
                  ,beginIp65504P2817L
                  ,IP_65504_P_2817_L_LEN
                 );
            localIp65504P2817LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2817LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2817L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2817L() {	 
			return (getShort(beginIp65504P2817L));
   	}
         int localIp65504P2818SCounter = -1;
         public boolean isIp65504P2818SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2818SCounter != sharedCounter;
            localIp65504P2818SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2818_S_LEN = 2;
  	/**
	 * serializeIp65504P2818S
	 */
	protected void serializeIp65504P2818S(short ip65504P2818S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2818S,IP_65504_P_2818_S_LEN)
                  ,beginIp65504P2818S
                  ,IP_65504_P_2818_S_LEN
                 );
            localIp65504P2818SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2818SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2818S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2818S() {	 
			return (getShort(beginIp65504P2818S));
   	}
         int localIp65504P2818LCounter = -1;
         public boolean isIp65504P2818LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2818LCounter != sharedCounter;
            localIp65504P2818LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2818_L_LEN = 2;
  	/**
	 * serializeIp65504P2818L
	 */
	protected void serializeIp65504P2818L(short ip65504P2818L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2818L,IP_65504_P_2818_L_LEN)
                  ,beginIp65504P2818L
                  ,IP_65504_P_2818_L_LEN
                 );
            localIp65504P2818LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2818LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2818L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2818L() {	 
			return (getShort(beginIp65504P2818L));
   	}
         int localIp65504P2819SCounter = -1;
         public boolean isIp65504P2819SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2819SCounter != sharedCounter;
            localIp65504P2819SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2819_S_LEN = 2;
  	/**
	 * serializeIp65504P2819S
	 */
	protected void serializeIp65504P2819S(short ip65504P2819S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2819S,IP_65504_P_2819_S_LEN)
                  ,beginIp65504P2819S
                  ,IP_65504_P_2819_S_LEN
                 );
            localIp65504P2819SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2819SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2819S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2819S() {	 
			return (getShort(beginIp65504P2819S));
   	}
         int localIp65504P2819LCounter = -1;
         public boolean isIp65504P2819LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2819LCounter != sharedCounter;
            localIp65504P2819LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2819_L_LEN = 2;
  	/**
	 * serializeIp65504P2819L
	 */
	protected void serializeIp65504P2819L(short ip65504P2819L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2819L,IP_65504_P_2819_L_LEN)
                  ,beginIp65504P2819L
                  ,IP_65504_P_2819_L_LEN
                 );
            localIp65504P2819LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2819LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2819L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2819L() {	 
			return (getShort(beginIp65504P2819L));
   	}
         int localIp65504P2820SCounter = -1;
         public boolean isIp65504P2820SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2820SCounter != sharedCounter;
            localIp65504P2820SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2820_S_LEN = 2;
  	/**
	 * serializeIp65504P2820S
	 */
	protected void serializeIp65504P2820S(short ip65504P2820S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2820S,IP_65504_P_2820_S_LEN)
                  ,beginIp65504P2820S
                  ,IP_65504_P_2820_S_LEN
                 );
            localIp65504P2820SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2820SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2820S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2820S() {	 
			return (getShort(beginIp65504P2820S));
   	}
         int localIp65504P2820LCounter = -1;
         public boolean isIp65504P2820LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2820LCounter != sharedCounter;
            localIp65504P2820LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2820_L_LEN = 2;
  	/**
	 * serializeIp65504P2820L
	 */
	protected void serializeIp65504P2820L(short ip65504P2820L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2820L,IP_65504_P_2820_L_LEN)
                  ,beginIp65504P2820L
                  ,IP_65504_P_2820_L_LEN
                 );
            localIp65504P2820LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2820LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2820L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2820L() {	 
			return (getShort(beginIp65504P2820L));
   	}
         int localIp65504P2821SCounter = -1;
         public boolean isIp65504P2821SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2821SCounter != sharedCounter;
            localIp65504P2821SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2821_S_LEN = 2;
  	/**
	 * serializeIp65504P2821S
	 */
	protected void serializeIp65504P2821S(short ip65504P2821S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2821S,IP_65504_P_2821_S_LEN)
                  ,beginIp65504P2821S
                  ,IP_65504_P_2821_S_LEN
                 );
            localIp65504P2821SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2821SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2821S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2821S() {	 
			return (getShort(beginIp65504P2821S));
   	}
         int localIp65504P2821LCounter = -1;
         public boolean isIp65504P2821LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2821LCounter != sharedCounter;
            localIp65504P2821LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2821_L_LEN = 2;
  	/**
	 * serializeIp65504P2821L
	 */
	protected void serializeIp65504P2821L(short ip65504P2821L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2821L,IP_65504_P_2821_L_LEN)
                  ,beginIp65504P2821L
                  ,IP_65504_P_2821_L_LEN
                 );
            localIp65504P2821LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2821LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2821L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2821L() {	 
			return (getShort(beginIp65504P2821L));
   	}




}
  
