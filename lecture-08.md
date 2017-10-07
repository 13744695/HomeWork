# CS424  Lecture 08
##### scribe - Helena Rothwell

---

### Tail Recursion:

<br/>

>
> 'Non-tail' recursion uses the stack frame to store a result and returns to it after the recursive call is finished, as every recursive call has to complete before the work of calculating the call is done the stack frame will grow accordingly. This can be costly not only in terms of memory, but it will be slower to run too.
>

<br/>

>
> 'Tail' recursion is where the recursive call is at the end (tail) of the function. The result of the recursive call is passed directly through to the function without employing stack space. Tail recursion calls are also faster than non tail calls. 
Non tail recursive calls can be rewritten as tail recursive calls. 
>

<br/>

- Recap: Defined a data structure in terms of lambda.

- General Form: Lambda is the ultimate declarative data structure

- Today we are talking about lambda, the ultimate goto

<br/>

> This is really useful to understand. You may think that goto is a low level thing such as a machine code level instruction. (think assembly language) Whereas a procedure call seems like a complex thing. 
>
<br/>

>BUT.... It's JUST as inexpensive as a goto!! 

<br/>
>What's happening when you call a subroutine? A Shift of control is a branch <=> is a goto. 
>
> When goto is finished, optionally, we have to get back to the start. Stashing the next address is not optional. 
> 
<br/>

> Arguments
> 
<br/>

> Subroutines don't always take arguments. Often they have to calculate them. It can be arranged that these arguments end up where they will be needed at time of calculating them.
>
<br/>
>
> Please see the factorial function created in C then translated into a scheme function in this lectures .scm file. 
>
<br/>
>
> Firstly, to translate the c function into a low level 'thing' we considered a label to be the target of a machine call. 
>
<br/> 
>
> Every program point will call a procedure, and arguments will all be live variables. 
>
<br/> 
>
> The following is a loose transcript of some code from the board with comments. Please refer to the .scm file when it becomes available for accurate transcript.

<br/>


  