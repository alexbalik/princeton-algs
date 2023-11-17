/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWord {
    public static void main(String[] args) {


    }
}


// sudo-code
// for this assignment, you'll want to keep checking standard input until there are no more strings. To do this, you can use StdIn.isEmpty() to check if there are any more strings in standard input. To keep checking until there are no more strings, use a 'while loop'. StdIn.isEmpty returns false if there are still strings left in the list


// While StdIn.isEmpty() returns false, keep re-running the loop
//
// i = 1
// champion = ''
// while StdIn.isEmpty() = false
//      temp-word = StdIn.readString()
//      probability-of-champ = 1/i
//      if StdRandom.bernoulli(probability-of-champ) = true
//          champion = temp-word
//      else
//          continue
//      i = i + 1
// StdOut.println(champion)
//
// i think the point is to use StdRandom.bernoulli(p) where p is (1/i) so that for the first word (i = 1), probability of that word being the champion is (1/i) = (1/1) = 1, and probability of that word not being the champion is 1 - (1/1) = 1 - 1 = 0. This means that the first word has to be the champion which makes sense.
