### How to manage multiple ssh keys in your personal computer

In fact, we often used different VCS to manage our codes and projects. For different version control system, we need to generate a new ssh key for authentication. We need to manage such keys that when we are going to clone something from the remotes. I will take using gitlab and github as example.

1. check the ssh-key first
   * `Command: cat ~/.ssh/id_rsa` If there are 
2. If not, then we need to add new ssh-key for first gitlab.
   * `Command: ssh-keygen -t rsa -C "E-mail"`
3. then copy the key
   * `Command: clip < ~/.ssh/id_rsa.pub`
4. then paste the key to your account.

Next, we need to add a new github ssh key:

5. generate a new ssh key and save the key into a different file(not id_rsa)

   * `Command: ssh-keygen -t rsa -f ~/.ssh/id_rsa.enter want your want here -C "E-mail"`

   Until now, there will be four files in the .ssh. 

6. In default, when you clone the repo from the remote, ssh will only read the `id_rsa` . So, we need firstly add the second ssh key to ssh agent

   *  `Command: ssh-add ~/.ssh/id_rsa.github`

7. add a new file named `config` to manage the private keys

   * `cd ~/.ssh`  && `touch config`

8. add following content into that config file

   ```
   # first.github 
   Host gitlab.com
   HostName gitlab.com
   User git
   IdentityFile ~/.ssh/id_rsa

   # second
   Host github.com
   HostName github.com
   User git
   IdentityFile ~/.ssh/id_rsa.github
   ```