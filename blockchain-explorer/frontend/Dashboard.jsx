import React, { useState, useEffect } from 'react';
import transactions from '../sample-data/transactions.json';

function Dashboard() {
  const [txs, setTxs] = useState([]);

  useEffect(() => {
    setTxs(transactions);
  }, []);

  return (
    <div>
      <h2>Recent Transactions</h2>
      <ul>
        {txs.map(tx => <li key={tx.id}>{tx.id}: {tx.amount} ARDR</li>)}
      </ul>
    </div>
  );
}

export default Dashboard;
