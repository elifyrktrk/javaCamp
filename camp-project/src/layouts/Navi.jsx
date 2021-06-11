import React, {useState} from 'react'
import CartSummary from './CartSummary'
import { Button, Container, Menu } from 'semantic-ui-react'
import SignedOut from './SignedOut'
import SignedIn from './SignedIn'
import { useHistory } from 'react-router-dom'

export default function Navi() {
  const [isAuthenticated, setisAuthenticated] = useState(false)

  const history = useHistory()
  function handleSignOut(params) {
    setisAuthenticated(false)
    history.push("/")
  }
  function handleSignIn(params) {
    setisAuthenticated(true)
  }

    return (
        <div>
            <Menu inverted fixed="top">
                <Container>
                <Menu.Item
          name='home'          
        />
        <Menu.Item
          name='messages'
        />

        <Menu.Menu position='right'>
          <CartSummary/>
          {isAuthenticated?<SignedIn signOut={handleSignOut}/>:<SignedOut signIn={handleSignIn}/>}
 
        </Menu.Menu>

                </Container>
       
      </Menu>
        </div>
    )
}
