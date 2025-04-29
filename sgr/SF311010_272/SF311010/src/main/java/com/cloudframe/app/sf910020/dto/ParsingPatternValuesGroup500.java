package com.cloudframe.app.sf910020.dto;

/**
*  The class ParsingPatternValuesGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ParsingPatternValuesGroup500 extends ParsingPatternValuesGroup500Serialized {
   

						@Getter @Setter private char[] parsingPatternValues500 = new char[2048];
					@Getter @Setter private ParsingPatternValues500Redefined parsingPatternValues500Redefined = new ParsingPatternValues500Redefined();
	
	/**
	* Constructor for ParsingPatternValuesGroup500
	**/
    public ParsingPatternValuesGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getParsingPatternValues500Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setParsingPatternValues500("               X      X       XX     X       X X     XX      XXX    X       X  X    X X     X XX    XX      XX X    XXX     XXXX   X       X   X   X  X    X  XX   X X     X X X   X XX    X XXX   XX      XX  X   XX X    XX XX   XXX     XXX X   XXXX    XXXXX  X       X    X  X   X   X   XX  X  X    X  X X  X  XX   X  XXX  X X     X X  X  X X X   X X XX  X XX    X XX X  X XXX   X XXXX  XX      XX   X  XX  X   XX  XX  XX X    XX X X  XX XX   XX XXX  XXX     XXX  X  XXX X   XXX XX  XXXX    XXXX X  XXXXX   XXXXXX X       X     X X    X  X    XX X   X   X   X X X   XX  X   XXX X  X    X  X  X X  X X  X  X XX X  XX   X  XX X X  XXX  X  XXXX X X     X X   X X X  X  X X  XX X X X   X X X X X X XX  X X XXX X XX    X XX  X X XX X  X XX XX X XXX   X XXX X X XXXX  X XXXXX XX      XX    X XX   X  XX   XX XX  X   XX  X X XX  XX  XX  XXX XX X    XX X  X XX X X  XX X XX XX XX   XX XX X XX XXX  XX XXXX XXX     XXX   X XXX  X  XXX  XX XXX X   XXX X X XXX XX  XXX XXX XXXX    XXXX  X XXXX X  XXXX XX XXXXX   XXXXX X XXXXXX  XXXXXXXX       X      XX     X X     XXX    X  X    X XX    XX X    XXXX   X   X   X  XX   X X X   X XXX   XX  X   XX XX   XXX X   XXXXX  X    X  X   XX  X  X X  X  XXX  X X  X  X X XX  X XX X  X XXXX  XX   X  XX  XX  XX X X  XX XXX  XXX  X  XXX XX  XXXX X  XXXXXX X     X X    XX X   X X X   XXX X  X  X X  X XX X  XX X X  XXXX X X   X X X  XX X X X X X X XXX X XX  X X XX XX X XXX X X XXXXX XX    X XX   XX XX  X X XX  XXX XX X  X XX X XX XX XX X XX XXXX XXX   X XXX  XX XXX X X XXX XXX XXXX  X XXXX XX XXXXX X XXXXXXXX      XX     XXX    X XX    XXXX   X  XX   X XXX   XX XX   XXXXX  X   XX  X  XXX  X X XX  X XXXX  XX  XX  XX XXX  XXX XX  XXXXXX X    XX X   XXX X  X XX X  XXXX X X  XX X X XXX X XX XX X XXXXX XX   XX XX  XXX XX X XX XX XXXX XXX  XX XXX XXX XXXX XX XXXXXXXX     XXX    XXXX   X XXX   XXXXX  X  XXX  X XXXX  XX XXX  XXXXXX X   XXX X  XXXX X X XXX X XXXXX XX  XXX XX XXXX XXX XXX XXXXXXXX    XXXX   XXXXX  X XXXX  XXXXXX X  XXXX X XXXXX XX XXXX XXXXXXXX   XXXXX  XXXXXX X XXXXX XXXXXXXX  XXXXXX XXXXXXXX XXXXXXXX".toCharArray());
    }





}
  
