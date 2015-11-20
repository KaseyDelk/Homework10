# Homework 10 - COMSC 1033

## Sort 6 Numbers Project

### Introduction
For this part of our homework we were to write a program that sorts 6 numbers. The program had to use an array, if statements, and method calls.

### Code
```java
public class Homework10SortArray {
	public static void main(String[] args) {
		System.out.println("This program uses arrays and if statements to sort numbers.\n");
		
		//Call the sortArray method
		sortArray();
		}
	public static void sortArray() {

		//Generate random numbers and sort
		int numbers = 6;
		int[] arrayNumber = new int[numbers];
		arrayNumber = createRandomArray(numbers);
		System.out.print("Our random unsorted array is: \n");
		for (int i = 0; i < numbers; i++ ){
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println(".");
		
		//Sort the numbers
		arrayNumber = sortTheArray(arrayNumber, numbers);
		System.out.print("\nOur sorted array is:\n");
		for (int i = 0; i < numbers; i++ ){
			System.out.print(arrayNumber[i] + " ");
		}
		System.out.println(".");
		
	}
	public static int[] createRandomArray(int listSize) {
		int[] arrayNumber = new int[listSize];
		// populate the array
		arrayNumber = populateArray(arrayNumber, listSize);
		
		// Test the array to see if there are duplicates.
		
		return arrayNumber;
	}
	public static int[] populateArray(int[] arrayNumber, int numbers) {
		
		int range = numbers * 1000;
		for (int i = 0; i < numbers; i++ ){
			arrayNumber[i] = (int)(Math.random()*range);
		}
		return arrayNumber;
	}
	
	public static int[] sortTheArray(int[] arrayNumber, int numbers) {
		
		int holderOne;
		int holderTwo;
		for (int counter = 1; counter <= numbers; counter++ ){
			
			for (int i = 0; i < numbers-1; i++ ){
				
				holderOne = arrayNumber[i];
				holderTwo = arrayNumber[i+1];
				
				if(holderTwo < holderOne){
					arrayNumber[i] = holderTwo;
					arrayNumber[i+1] = holderOne;
				}
				
			}
		}
		return arrayNumber;
	}
}
```
### Console Tests
Case One:
```java
This program uses arrays and if statements to sort numbers.

Our random unsorted array is: 
204 347 3687 999 3885 4735 .

Our sorted array is:
204 347 999 3687 3885 4735 .
```
Case Two:
```java
This program uses arrays and if statements to sort numbers.

Our random unsorted array is: 
822 5704 2641 1679 1315 1846 .

Our sorted array is:
822 1315 1679 1846 2641 5704 .
```
Case Three:
```java
This program uses arrays and if statements to sort numbers.

Our random unsorted array is: 
5279 1813 3395 3848 4884 5280 .

Our sorted array is:
1813 3395 3848 4884 5279 5280 .
```

### Command Prompt
```
D:\>cd KLD_CS1_WorkSpace

D:\KLD_CS1_WorkSpace>cd Homework10SortArray

D:\KLD_CS1_WorkSpace\Homework10SortArray>git status
fatal: Not a git repository (or any of the parent directories): .git

D:\KLD_CS1_WorkSpace\Homework10SortArray>git init
Initialized empty Git repository in D:/KLD_CS1_WorkSpace/Homework10SortArray/.git/

D:\KLD_CS1_WorkSpace\Homework10SortArray>git add .

D:\KLD_CS1_WorkSpace\Homework10SortArray>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Kasey@KaseyDee.(none)')

D:\KLD_CS1_WorkSpace\Homework10SortArray>git remote add origin https://github.com/KaseyDelk/Homework10.git

D:\KLD_CS1_WorkSpace\Homework10SortArray>git push -u origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/KaseyDelk/Homework10.git'

D:\KLD_CS1_WorkSpace\Homework10SortArray>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master


D:\KLD_CS1_WorkSpace\Homework10SortArray>git push --set-upstream origin master
error: src refspec master does not match any.
error: failed to push some refs to 'https://github.com/KaseyDelk/Homework10.git'

D:\KLD_CS1_WorkSpace\Homework10SortArray>git status
On branch master

Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   .classpath
        new file:   .project
        new file:   bin/Homework10SortArray.class
        new file:   src/Homework10SortArray.java


D:\KLD_CS1_WorkSpace\Homework10SortArray>git add .

D:\KLD_CS1_WorkSpace\Homework10SortArray>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Kasey@KaseyDee.(none)')

D:\KLD_CS1_WorkSpace\Homework10SortArray>git config
usage: git config [<options>]

Config file location
    --global              use global config file
    --system              use system config file
    --local               use repository config file
    -f, --file <file>     use given config file
    --blob <blob-id>      read config from given blob object

Action
    --get                 get value: name [value-regex]
    --get-all             get all values: key [value-regex]
    --get-regexp          get values for regexp: name-regex [value-regex]
    --get-urlmatch        get value specific for the URL: section[.var] URL
    --replace-all         replace all matching variables: name value [value_regex]
    --add                 add a new variable: name value
    --unset               remove a variable: name [value-regex]
    --unset-all           remove all matches: name [value-regex]
    --rename-section      rename section: old-name new-name
    --remove-section      remove a section: name
    -l, --list            list all
    -e, --edit            open an editor
    --get-color           find the color configured: slot [default]
    --get-colorbool       find the color setting: slot [stdout-is-tty]

Type
    --bool                value is "true" or "false"
    --int                 value is decimal number
    --bool-or-int         value is --bool or --int
    --path                value is a path (file or directory name)

Other
    -z, --null            terminate values with NUL byte
    --name-only           show variable names only
    --includes            respect include directives on lookup


D:\KLD_CS1_WorkSpace\Homework10SortArray>git config user.name "Kasey Delk"

D:\KLD_CS1_WorkSpace\Homework10SortArray>git config user.name "delkk@student.swosu.edu"

D:\KLD_CS1_WorkSpace\Homework10SortArray>git add .

D:\KLD_CS1_WorkSpace\Homework10SortArray>git commit -m "first commit"

*** Please tell me who you are.

Run

  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"

to set your account's default identity.
Omit --global to set the identity only in this repository.

fatal: unable to auto-detect email address (got 'Kasey@KaseyDee.(none)')

D:\KLD_CS1_WorkSpace\Homework10SortArray>git config --global user.email "delkk@student.swosu.edu"

D:\KLD_CS1_WorkSpace\Homework10SortArray>git config --global user.name "Kasey Delk

D:\KLD_CS1_WorkSpace\Homework10SortArray>git init
Reinitialized existing Git repository in D:/KLD_CS1_WorkSpace/Homework10SortArray/.git/

D:\KLD_CS1_WorkSpace\Homework10SortArray>git add .

D:\KLD_CS1_WorkSpace\Homework10SortArray>git commit -m "first commit"
[master (root-commit) ff9bfdf] first commit
 4 files changed, 90 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Homework10SortArray.class
 create mode 100644 src/Homework10SortArray.java

D:\KLD_CS1_WorkSpace\Homework10SortArray>git remote add origin https://github.com/KaseyDelk/Homework10.git
fatal: remote origin already exists.

D:\KLD_CS1_WorkSpace\Homework10SortArray>git push -u origin master
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 2.37 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/Homework10.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

D:\KLD_CS1_WorkSpace\Homework10SortArray>git checkout -b dev
Switched to a new branch 'dev'

D:\KLD_CS1_WorkSpace\Homework10SortArray>git status
On branch dev
nothing to commit, working directory clean

D:\KLD_CS1_WorkSpace\Homework10SortArray>git status
On branch dev
nothing to commit, working directory clean

D:\KLD_CS1_WorkSpace\Homework10SortArray>git push --set-upstream origin dev
Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Total 0 (delta 0), reused 0 (delta 0)
To https://github.com/KaseyDelk/Homework10.git
 * [new branch]      dev -> dev
Branch dev set up to track remote branch dev from origin.

D:\KLD_CS1_WorkSpace\Homework10SortArray>git add .

D:\KLD_CS1_WorkSpace\Homework10SortArray>git commit -m "changed numbers in array
[dev e32ff49] changed numbers in array
 2 files changed, 1 insertion(+), 1 deletion(-)

D:\KLD_CS1_WorkSpace\Homework10SortArray>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': KaseyDelk
Password for 'https://KaseyDelk@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 550 bytes | 0 bytes/s, done.
Total 6 (delta 2), reused 0 (delta 0)
To https://github.com/KaseyDelk/Homework10.git
   ff9bfdf..e32ff49  dev -> dev

D:\KLD_CS1_WorkSpace\Homework10SortArray>
```

### Summary
This homework project was especially difficult for me; I had a lot of help from Dr. Evert's online repository. After looking at how his code worked, mine was easier to write. 
