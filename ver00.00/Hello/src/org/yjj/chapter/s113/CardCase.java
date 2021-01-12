package org.yjj.chapter.s113;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class CardCase {

	private List<Card> cards=new ArrayList<Card>();
	 public CardCase() {
		cards.clear(); 
	 }
	 public List<Card> getCards() {
		return cards;
	 }
	 public int count(){
		return cards.size(); 
	 }
	 public Card getCard(int index){
		return cards.get(index);
	 }
	 public void make(){
		cards.clear(); 
		int deck=CardUtil.SUIT.length;
		int suit=CardUtil.VALU.length;
		int count=0;
		
		while(count!=deck*suit){  
			Card c=new Card();     
			if(!cards.contains(c)){ 
				cards.add(c);       
				count++;
			}
		}
	 }
	 public void shuffle(){
		Collections.shuffle(cards);
	 }

	 public void print(){
		int suit=CardUtil.VALU.length;
		IntStream.range(0, cards.size())
		  .forEach(
			i ->{ System.out.printf("%s ",cards.get(i).toString());
				  if((i+1)%suit==0){System.out.println();} 
		        }
		    );
	 }

	 public void sort(){
		cards.sort((c1, c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());});
	 }

	 public void rsort(){
		cards.sort(
				(c1, c2) ->{return - c1.getCardVal().compareTo(c2.getCardVal());});
	 }
}
