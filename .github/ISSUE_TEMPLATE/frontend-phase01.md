---
name: Frontend - Phase 01
title: CodeStar[YEAR]-FE-Phase01-Team[TEAM_NUMBER]
labels: Frontend
about: This issue template is based on frontend phase 01 document
---

-   [ ] Introduction
    -   [ ] Learning
        -   [ ] Variables
            -   [ ] Which variable you will use in below cases:
                1. `your answer`

                ```javascript
                [variable type] myVar = 0;
                while (myVar < 10) {
                    myVar += 2;
                }
                ```

                2. `your answer`

                ```javascript
                [variable type] myVar = {x: 1, y: 2};
                myVar.x = 3;
                console.log(myVar);   
                ```

            -   [ ] Why using var is not recommended?
                `your answer`

        - [ ] Regular Function vs Arrow Function
            - [ ] This
              - [ ] in below code how can we log value 'hello from code star': `your answer`
                ```javascript
                class A {
                    writeHello(callbackFunction) {
                        callbackFunction();
                    }
                }

                class B {
                    message = 'hello from code star';
                    logMessage() {
                        console.log(this.message);
                    };
                }

                const a = new A();
                const b = new B();
                a.writeHello(b.logMessage);
                ```
      - [ ] Event Loop
        - [ ] What is output of below code (please do not run the code before answering question): `your answer`
          ```javascript
          let x = 0;
          while (x < 3) {
            console.log(x);
            setTimeout(() => { console.log(x); }, 0);
            x++;
          }
          ```