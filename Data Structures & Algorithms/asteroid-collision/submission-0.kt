class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        for(asteroid in asteroids){
            
            var alive = true
            while(stack.isNotEmpty()
             && alive 
             && stack.last() > 0 
             && asteroid <0){
                //collision logic
                if(abs(asteroid) == stack.last()){
                    stack.removeLast()
                    alive = false
                }
                else if(stack.last() > abs(asteroid)){
                    alive = false
                }
                else  if (stack.last() < abs(asteroid)){
                    stack.removeLast()
                }
                
             }
             if(alive){
                stack.addLast(asteroid)
             }
        }
        return stack.toIntArray()

    }
}
